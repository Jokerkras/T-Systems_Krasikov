package com.krasikov.service.impl;

import com.krasikov.domain.Client;
import com.krasikov.dto.ClientDto;
import com.krasikov.repositories.ClientRepository;
import com.krasikov.service.IClientService;
import com.krasikov.mapper.ClientMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//TODO Transaction
@Service
public class ClientService implements IClientService {

    private ClientRepository repo;

    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    @Override
    public ClientDto getClientBuId(long id) {
        return ClientMapper.INSTANCE.clientToClientDto(repo.getClientById(id));
    }

    @Override
    public List<ClientDto> getClients() {
        List<ClientDto> clients = new ArrayList<>();
        for(Client client: repo.getClients()) {
            clients.add(ClientMapper.INSTANCE.clientToClientDto(client));
        }
        return clients;
    }

    @Override
    public void addClient(Client client) {
        repo.addClient(client);
    }

    @Override
    public void deleteClient(Client client) {
        repo.deleteClient(client);
    }
}
