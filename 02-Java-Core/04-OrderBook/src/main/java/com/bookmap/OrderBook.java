package com.bookmap;

import java.io.*;
import java.util.*;

public class OrderBook {

    private final TreeMap<Integer, Integer> limitSellers = new TreeMap<>();
    private final TreeMap<Integer, Integer> limitBuyers = new TreeMap<>(Comparator.reverseOrder());
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
                int price = Integer.parseInt(data[1]);
                int size = Integer.parseInt(data[2]);
                String orderType = "bid".equals(data[3]) ? "buyLimit" : "sellLimit";

                setLimitOrder(price, size, orderType);

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

    private void setLimitOrder(int price, int size, String limitOrderType) {

        TreeMap<Integer, Integer> limitOrders = "buyLimit".equals(limitOrderType) ? limitBuyers : limitSellers;

        if (0 == size)
            limitOrders.remove(price);
        else if(limitOrders.containsKey(price))
            limitOrders.replace(price, size);
        else
            limitOrders.put(price, size);
    }

    private int executeMarketOrder(int marketOrderSize, String marketOrderType) {

        TreeMap<Integer, Integer> limitOrders = "buy".equals(marketOrderType) ? limitSellers : limitBuyers;

        int price = limitOrders.firstKey();
        int limitOrderSize = limitOrders.get(price);
        int sizeRest = limitOrderSize - marketOrderSize;

        String limitOrderType = "buy".equals(marketOrderType) ? "sellLimit" : "buyLimit";

        if (sizeRest > 0)
            setLimitOrder(price, sizeRest, limitOrderType);
        else
            setLimitOrder(price, 0, limitOrderType);

        int notExecutedMarketOrderSize = sizeRest >= 0 ? 0 : -sizeRest;

        return notExecutedMarketOrderSize;
    }

    private String executeQuery(String[] data) {

        String result = "";
        int price, size;

        if ("size".equals(data[1])) {
            price = Integer.parseInt(data[2]);

            if (limitBuyers.containsKey(price))
                size = limitBuyers.get(price);
            else if (limitSellers.containsKey(price))
                size = limitSellers.get(price);
            else
                size = 0;

            result = String.valueOf(size);
        } else {
            TreeMap<Integer, Integer> limitOrders = "best_ask".equals(data[1]) ? limitSellers : limitBuyers;

            price = limitOrders.firstKey();
            size = limitOrders.get(price);

            result = price + "," + size;
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
}
