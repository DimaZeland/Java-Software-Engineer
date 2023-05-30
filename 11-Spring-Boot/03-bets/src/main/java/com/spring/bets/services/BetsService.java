package com.spring.bets.services;

import com.spring.bets.models.Bet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BetsService
{
    private Map<String, Integer> bets = Collections.synchronizedMap(new HashMap<>());

    public BetsService()
    {

        bets.put("ferrari", 0);
        bets.put("bmw", 0);
        bets.put("audi", 0);
        bets.put("mercedes", 0);
    }

    public boolean hasCar(String car)
    {
        return bets.containsKey(car);
    }

    public void addBet(String car, Integer dollars)
    {
        Integer totalBet = bets.get(car) + dollars;
        bets.put(car, totalBet);
    }

    public Set<String> getAllCars()
    {
        return bets.keySet();
    }

    public Set<Map.Entry<String, Integer>> getAllBets()
    {
        return bets.entrySet();
    }

    public Bet getBetByCar(String car)
    {
        Integer totalBet = bets.get(car);

        return Bet.builder().carName(car).betAmount(totalBet).build();
    }
}

