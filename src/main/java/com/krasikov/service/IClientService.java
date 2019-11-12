package com.krasikov.service;

import com.krasikov.domain.Client;
import com.krasikov.dto.ClientDto;

import java.util.List;

public interface IClientService {
    ClientDto getClientBuId(long id);

    List<ClientDto> getClients();

    void addClient(Client client);

    void deleteClient(Client client);
}
