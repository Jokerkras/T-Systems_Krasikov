package com.krasikov.repositories;

import com.krasikov.domain.Client;
import com.krasikov.domain.Option;
import com.krasikov.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ClientRepository implements IClientRepository{

    private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    @Override
    public List<Client> getClients() {
        Session session = sessionFactory.openSession();
        session.close();
        return null;
    }

    @Override
    public Client getClientById() {
        return null;
    }

    @Override
    public void addClient(Client client) {

    }
}
