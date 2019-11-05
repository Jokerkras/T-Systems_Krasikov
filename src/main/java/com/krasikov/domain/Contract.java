package com.krasikov.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Long id;

    private Long number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_tariff")
    private Tariff tariff;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "contract_option", joinColumns = {
            @JoinColumn(name = "contract_id", nullable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "option_id", nullable = false)
    })
    private Set<Option> options = new HashSet<Option>();

    public Contract(Long number, Tariff tariff, HashSet<Option> options) {
        this.number = number;
        this.tariff = tariff;
        this.options = options;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public boolean removeOption(Option option) {
        return options.remove(option);
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}