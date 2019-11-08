package com.krasikov.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "OPTION")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "option_id")
    private Long id;

    private String title;

    private double price;

    @Column(name = "connection_price")
    private double connectionPrice;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "possibleOptions")
    @Column(name = "possible_tariffs")
    private Set<Tariff> possibleTariffs = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "options")
    private Set<ContractForNumber> contractForNumbers = new HashSet<>();

    public Option(String title, double price, double connectionPrice) {
        this.title = title;
        this.price = price;
        this.connectionPrice = connectionPrice;
    }

    public Option() { }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("id = %d, title = %s, price = %f, connection price = %f", id, title, price, connectionPrice);
    }
}