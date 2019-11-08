package com.krasikov.dto;

import com.krasikov.domain.Option;

import java.util.Set;

public class TariffDto {
    private String title;
    private double price;
    private double connectionPrice;
    private Set<Option> options;

    public TariffDto(String title, double price, double connectionPrice, Set<Option> options) {
        this.title = title;
        this.price = price;
        this.connectionPrice = connectionPrice;
        this.options = options;
    }

    public TariffDto() {
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

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
