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
        synchronized (bets)
        {
            Integer totalBet = bets.get(car) + dollars;
            try
            {
                Thread.sleep(3000);

            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            bets.put(car, totalBet);
        }
    }

    public List<Bet> getBets(String car)
    {
        List<Bet> betsList = new ArrayList<Bet>();

        if (car == null)
        {
            for (String key : bets.keySet())
            {
                Bet bet = Bet.builder().carName(key).betAmount(bets.get(key)).build();
                betsList.add(bet);
            }
        } else
        {

            Integer totalBet = bets.get(car);
            Optional<Integer> optionalInteger = Optional.ofNullable(totalBet);

            Bet bet = Bet.builder().carName(car).betAmount(optionalInteger.orElse(0)).build();
            betsList.add(bet);
        }

        return betsList;
    }
}

