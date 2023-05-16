package com.bookmap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class OrderBook {

    private final TreeSet<Order> limitSellers = new TreeSet<>();
    private final TreeSet<Order> limitBuyers = new TreeSet<>();
    private StringBuilder outputData = new StringBuilder();

    public void manage() {

        List<String> lines = readInputData();

        for (String line : lines) {
            String[] data = line.split(",");
            doAction(data);
        }

        writeOutputData();
    }

    private List<String> readInputData() {

        final String file = "input.txt";
        List<String> lines = new ArrayList<>();

        InputStream in = this.getClass()
                .getClassLoader().getResourceAsStream(file);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String s;
            while ((s = br.readLine()) != null) {
                lines.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return lines;
    }

    private void doAction(String[] data) {

        switch (data[0]) {
            case "u": {
                setLimitOrder(data);
                break;
            }

            case "o": {
                int orderSize = Integer.parseInt(data[2]);
                String orderType = data[1];

                do {
                    orderSize = executeMarketOrder(orderSize, orderType);
                } while (orderSize != 0);

                break;
            }

            case "q": {
                String result = executeQuery(data);
                outputData.append(result + '\n');
                break;
            }
        }
    }

    private void setLimitOrder(String[] data) {

        int price = Integer.parseInt(data[1]);
        int size = Integer.parseInt(data[2]);
        Order order = new Order(price, size);

        if ("bid".equals(data[3]))
            limitBuyers.add(order);
        else
            limitSellers.add(order);
    }

    private int executeMarketOrder(int marketOrderSize, String orderType) {

        int limitOrderSize = "buy".equals(orderType) ? limitSellers.first().getSize() : limitBuyers.last().getSize();
        int sizeRest = limitOrderSize - marketOrderSize;

        if (sizeRest > 0) {
            if ("buy".equals(orderType))
                limitSellers.first().setSize(sizeRest);
            else
                limitBuyers.last().setSize(sizeRest);
        } else {
            if ("buy".equals(orderType))
                limitSellers.pollFirst();
            else
                limitBuyers.pollLast();
        }

        int notExecutedMarketOrderSize = sizeRest > 0 ? 0 : -sizeRest;

        return notExecutedMarketOrderSize;
    }

    private String executeQuery(String[] data) {

        String result = "";

        switch (data[1]) {
            case "best_bid": {
                Order order = limitBuyers.last();
                result = order.getPrice() + "," + order.getSize();
                break;
            }

            case "best_ask": {
                Order order = limitSellers.first();
                result = order.getPrice() + "," + order.getSize();
                break;
            }

            case "size": {
                int price = Integer.parseInt(data[2]);
                int size = 0;
                boolean isFound = false;

                for (Order order : limitBuyers) {
                    if (order.getPrice() == price) {
                        size = order.getSize();
                        isFound = true;
                        break;
                    }
                }

                if (false == isFound)
                    for (Order order : limitSellers) {
                        if (order.getPrice() == price) {
                            size = order.getSize();
                            break;
                        }
                    }

                result = String.valueOf(size);
                break;
            }
        }

        return result;
    }

    private void writeOutputData() {

        final String file = "output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(outputData.toString());
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

//    private void TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
}
