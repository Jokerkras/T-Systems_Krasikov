package com.krasikov.repositories;

import com.krasikov.domain.Client;

import java.util.List;

public interface IClientRepository {
    List<Client> getClients();
    Client getClientById();
    void addClient(Client client);
}
