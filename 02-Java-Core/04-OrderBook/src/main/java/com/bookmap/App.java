package com.bookmap;

public class App {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();


        OrderBook orderBook = new OrderBook();
        orderBook.manage();


        System.out.println(System.currentTimeMillis() - time);
    }
}
