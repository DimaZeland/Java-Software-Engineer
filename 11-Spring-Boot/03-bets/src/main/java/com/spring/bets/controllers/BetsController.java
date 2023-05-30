package com.spring.bets.controllers;

import com.spring.bets.models.Bet;
import com.spring.bets.services.BetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/bets")
public class BetsController
{
    private final BetsService betsService;

    public BetsController(BetsService betsService)
    {
        this.betsService = betsService;
    }

    @GetMapping("/index")
    public String createBet(Model model)
    {
        model.addAttribute("cars", betsService.getAllCars());
        model.addAttribute("bet", Bet.builder().build());

        return "bets/index";
    }

    @PostMapping()
    public String addBet(Model model, @ModelAttribute("bet") @Valid Bet bet, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            betsService.getAllCars();

            model.addAttribute("cars", betsService.getAllCars());

            return "bets/index";
        }

        String car = bet.getCarName();

        if (betsService.hasCar(car))
        {
            betsService.addBet(car, bet.getBetAmount());
            return "bets/bet-accepted";
        } else
        {
            return "bets/car-name-error";
        }
    }

    @GetMapping()
    public String viewBets(@RequestParam(name = "car", required = false) String car, Model model)
    {
        if (car == null)
        {
            model.addAttribute("bets", betsService.getAllBets());
            return "bets/all-bets";
        } else
        {
            model.addAttribute("bet", betsService.getBetByCar(car));
            return "bets/bets-by-car";
        }
    }
}
