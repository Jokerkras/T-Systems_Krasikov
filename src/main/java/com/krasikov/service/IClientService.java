package com.krasikov.service;

import com.krasikov.domain.Client;

import java.util.List;

public interface IClientService {
    Client getClientBuId(long id);

    List<Client> getClients();

    void addClient(Client client);
}
