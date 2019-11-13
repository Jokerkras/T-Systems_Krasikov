package com.krasikov.repositories;

import com.krasikov.domain.Client;
import com.krasikov.domain.MobileNumber;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository implements IClientRepository{

    private Session session;

    @Autowired
    private SessionFactory sessionFactory;
    private static Logger logger = Logger.getLogger(ClientRepository.class);


    @Override
    public List<Client> getClients() {
        List<Client> clients = new ArrayList<>();
        session = sessionFactory.getCurrentSession();
        clients = session.createQuery("FROM Client").list();
        logger.info("\nGet list of clients");
        return clients;
    }

    @Override
    public Client getClientById(Long id) {
        Client client = null;
        //TODO настротить transaction manager => далее работа с аннотациямиы
        session = sessionFactory.getCurrentSession(); //TODO getCurrentSession and remove transactions, delete try block
        client = (Client) session.createQuery("from Client c where c.id = " + id).getSingleResult();//TODO Creteria API or HQL и с чем проще пагинация
        //logger.info("\nGet client - " + client.toString());
        return client;
    }

    @Override
    public void addClient(Client client) {
        session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(client);
        logger.info("\nAdded CLIENT" + client.toString());
    }

    @Override
    public void deleteClient(Client client) {
        session = sessionFactory.getCurrentSession();
        session.delete(client);
        logger.info("\nDelete CLIENT" + client.toString());
    }
}
