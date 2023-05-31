package com.spring.bets.controllers;

import com.spring.bets.models.Bet;
import com.spring.bets.services.BetsService;
import com.spring.bets.util.BetErrorResponse;
import com.spring.bets.util.BetNotAddException;
import com.spring.bets.util.CarNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody над каждым методом
@RequestMapping("/bets")
public class BetsController
{
    private final BetsService betsService;

    public BetsController(BetsService betsService)
    {
        this.betsService = betsService;
    }

    @GetMapping()
    public List<Bet> getBets(@RequestParam(name = "car", required = false) String car)
    {
        return betsService.getBets(car);
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> addBet(@RequestBody @Valid Bet bet, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            StringBuilder errorMessage = new StringBuilder();

            List<FieldError> errors = bindingResult.getFieldErrors();

            for (FieldError error : errors)
            {
                errorMessage.append(error.getField())
                        .append(" - ").append(error.getDefaultMessage())
                        .append(";");
            }
            throw new BetNotAddException(errorMessage.toString());
        }

        String car = bet.getCarName();

        if (betsService.hasCar(car))
        {
            betsService.addBet(car, bet.getBetAmount());
            return ResponseEntity.ok(HttpStatus.OK);
        } else
        {
            throw new CarNotFoundException(car);
        }
    }

    @ExceptionHandler
    private ResponseEntity<BetErrorResponse> handleException(CarNotFoundException e)
    {
        BetErrorResponse betErrorResponse =
                new BetErrorResponse("Car with this name wasn't found", System.currentTimeMillis());
        // В теле ответа будет betErrorResponse
        return new ResponseEntity<>(betErrorResponse, HttpStatus.NOT_FOUND); // status 404
    }

    @ExceptionHandler
    private ResponseEntity<BetErrorResponse> handleException(BetNotAddException e)
    {
        BetErrorResponse betErrorResponse =
                new BetErrorResponse(e.getMessage(), System.currentTimeMillis());
        // В теле ответа будет betErrorResponse
        return new ResponseEntity<>(betErrorResponse, HttpStatus.BAD_REQUEST); //
    }
}
