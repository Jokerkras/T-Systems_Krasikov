package com.krasikov.service.impl;

import com.krasikov.domain.Client;
import com.krasikov.domain.MobileNumber;
import com.krasikov.repositories.ClientRepository;
import com.krasikov.service.IClientService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@Service
public class MockClientService implements IClientService {

    private List<Client> clients = new LinkedList<>();
    private ClientRepository repo = new ClientRepository();

    public MockClientService() {
        clients.add(new Client("Ivan", "Ivanovich", LocalDate.of(1999,2,4), "ivanovich@mail.ru", "has", "somehere", new HashSet<MobileNumber>(), "1234"));
        clients.add(new Client("Ivan2", "Ivanovich2", LocalDate.of(1999,2,4), "ivanovich2@mail.ru", "has", "somehere", new HashSet<MobileNumber>(), "1234"));
        clients.add(new Client("Ivan3", "Ivanovich3", LocalDate.of(1999,2,4), "ivanovich3@mail.ru", "has", "somehere", new HashSet<MobileNumber>(), "1234"));
        clients.add(new Client("Ivan4", "Ivanovich4", LocalDate.of(1999,2,4), "ivanovich4@mail.ru", "has", "somehere", new HashSet<MobileNumber>(), "1234"));
        clients.add(new Client("Ivan5", "Ivanovich5", LocalDate.of(1999,2,4), "ivanovich5@mail.ru", "has", "somehere", new HashSet<MobileNumber>(), "1234"));
    }

    @Override
    public Client getClientBuId(long id) {
        return clients.get((int)id);
    }

    @Override
    public List<Client> getClients() {
        return repo.getClients();
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }
}
