package com.krasikov.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TARIFF")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tariff_id")
    private Long id;

    private String title;

    private double price;

    @Column(name = "connection_price")
    private double connectionPrice;

    @Column(name = "possible_options")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tariff_option", joinColumns = {
        @JoinColumn(name = "tariff_id", nullable = false)},
            inverseJoinColumns = {
                  @JoinColumn(name = "option_id", nullable = false)
    })
    private Set<Option> possibleOptions = new HashSet<Option>();

    @OneToMany(mappedBy = "tariff")
    private Set<Contract> conracts = new HashSet<Contract>();

    public Tariff(String title, double price, HashSet<Option> possibleOptions) {
        this.title = title;
        this.price = price;
        this.possibleOptions = possibleOptions;
    }

    public void addOption(Option option) {
        possibleOptions.add(option);
    }

    public boolean removeOption(Option option) {
        return possibleOptions.remove(option);
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

    public Set<Option> getPossibleOptions() {
        return possibleOptions;
    }

    public void setPossibleOptions(Set<Option> possibleOptions) {
        this.possibleOptions = possibleOptions;
    }
}