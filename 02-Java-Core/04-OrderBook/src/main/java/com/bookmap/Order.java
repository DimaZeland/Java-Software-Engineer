package com.bookmap;

public class Order implements Comparable<Order> {

    private int price;
    private int size;

    public Order(int price, int size) {

        this.price = price;
        this.size = size;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    @Override
    public int compareTo(Order o) {

        return this.price - o.price;
    }
}
