package com.krasikov.dto;

import com.krasikov.domain.Client;
import com.krasikov.domain.MobileNumber;
import com.krasikov.domain.Option;
import com.krasikov.domain.Tariff;

import java.util.Set;

public class ContractForNumberDto {
    private MobileNumber number;
    private Tariff tariff;
    private Client client;
    private Set<Option> options;

    public ContractForNumberDto(MobileNumber number, Tariff tariff, Client client, Set<Option> options) {
        this.number = number;
        this.tariff = tariff;
        this.client = client;
        this.options = options;
    }

    public ContractForNumberDto() {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
