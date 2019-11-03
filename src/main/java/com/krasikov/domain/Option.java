package com.krasikov.domain;

public class Option {
    private String title;
    private double price;
    private double connectionPrice;

    public Option(String title, double price, double connectionPrice) {
        this.title = title;
        this.price = price;
        this.connectionPrice = connectionPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getConnectionPrice() {
        return connectionPrice;
    }

    public void setConnectionPrice(double connectionPrice) {
        this.connectionPrice = connectionPrice;
    }
}