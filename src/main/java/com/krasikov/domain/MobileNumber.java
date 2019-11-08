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
    private ContractForNumber contractForNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client")
    private Client client;

    public MobileNumber(Long number, ContractForNumber contractForNumber, Client client) {
        this.number = number;
        this.contractForNumber = contractForNumber;
        this.client = client;
    }

    public MobileNumber() { }

    public Long getNumber() {
        return number;
    }

    public ContractForNumber getContractForNumber() {
        return contractForNumber;
    }

    public void setContractForNumber(ContractForNumber contractForNumber) {
        this.contractForNumber = contractForNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
