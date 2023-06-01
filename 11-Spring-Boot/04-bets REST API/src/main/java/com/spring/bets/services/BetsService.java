package com.spring.bets.services;

import com.spring.bets.models.Bet;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BetsService {

    public static void main(String[] args) {
        List<String> cars = List.of("ferrari", "bmw", "audi", "mercedes");

        long start = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1_000_000; j++) {
                    addBet(cars.get(j % 4), 1);
                }
            });
            threads.add(thread);
        }

        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ignore) {}
        }

        long end = System.currentTimeMillis();
        System.out.println("result: " + bets);
        System.out.println("duration: " + (end - start) + "ms");
    }

    private static Map<String, Integer> bets = new ConcurrentHashMap<>();

    public BetsService() {
        bets.put("ferrari", 0);
        bets.put("bmw", 0);
        bets.put("audi", 0);
        bets.put("mercedes", 0);
    }

    public static boolean hasCar(String car) {
        return bets.containsKey(car);
    }

    public synchronized static void addBet(String car, Integer dollars) {
        bets.merge(car, dollars, Integer::sum);
//        bets.computeIfAbsent();
//        bets.computeIfPresent();
//        bets.putIfAbsent();
//        bets.getOrDefault();
//        bets.forEach();

        /*synchronized (bets) {
            Integer totalBet = bets.get(car) + dollars;
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bets.put(car, totalBet);
        }*/
    }

    public static List<Bet> getBets(String car) {
        List<Bet> betsList = new ArrayList<>();

        if (car == null) {
            for (String key : bets.keySet()) {
                Bet bet = Bet.builder().carName(key).betAmount(bets.get(key)).build();
                betsList.add(bet);
            }
        } else {
            Integer totalBet = bets.get(car);
            Bet bet = Bet.builder().carName(car).betAmount(totalBet).build();
            betsList.add(bet);
        }

        return betsList;
    }
}

