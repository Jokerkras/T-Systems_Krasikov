package com.krasikov.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CONTRACT")
public class ContractForNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "number_id", referencedColumnName = "number_id")
    private MobileNumber number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_tariff")
    private Tariff tariff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client")
    private Client client;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "contract_option", joinColumns = {
            @JoinColumn(name = "contract_id", nullable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "option_id", nullable = false)
    })
    private Set<Option> options = new HashSet<Option>();

    public ContractForNumber(MobileNumber number, Tariff tariff, Client client, Set<Option> options) {
        this.number = number;
        this.tariff = tariff;
        this.client = client;
        this.options = options;
    }

    public ContractForNumber() { }

    public void addOption(Option option) {
        options.add(option);
    }

    public boolean removeOption(Option option) {
        return options.remove(option);
    }

    public MobileNumber getNumber() {
        return number;
    }

    public void setNumber(MobileNumber number) {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}