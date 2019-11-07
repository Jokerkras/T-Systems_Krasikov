package com.krasikov.domain;

import javax.persistence.*;

@Entity
@Table(name = "MOBILENUMBER")
public class MobileNumber {
    @Id
    @Column(name = "number_id")
    private Long number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    private Contract contract;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client")
    private Client client;

    public MobileNumber(Long number, Contract contract, Client client) {
        this.number = number;
        this.contract = contract;
        this.client = client;
    }

    public MobileNumber() { }

    public Long getNumber() {
        return number;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
