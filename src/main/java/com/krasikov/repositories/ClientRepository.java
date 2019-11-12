package com.krasikov.repositories;

import com.krasikov.domain.Client;
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
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            clients = session.createQuery("FROM Client").list();
            session.getTransaction().commit();
            logger.info("\nGet list of clients");
        } catch (Exception e) {
            if(session.getTransaction() != null) {
                logger.info("\n Transaction rollbacked");
                session.getTransaction().rollback();
            }
        } finally {
            if(session != null) {
                session.close();
            }
        }
        return clients;
    }

    @Override
    public Client getClientById(Long id) {
        Client client = null;
        try {
            //TODO настротить transaction manager => далее работа с аннотациямиы
            session = sessionFactory.openSession(); //TODO getCurrentSession and remove transactions, delete try block
            session.beginTransaction();
            client = (Client) session.createQuery("from Client c where c.id = " + id).getSingleResult();//TODO Creteria API or HQL и с чем проще пагинация
            session.getTransaction().commit();
            //logger.info("\nGet client - " + client.toString());
        } catch (Exception e) {
            if(session.getTransaction() != null) {
                //logger.info("\n Transaction rollbacked");
                session.getTransaction().rollback();
            }
        } finally {
            if(session != null) {
                session.close();
            }
        }

        return client;
    }

    @Override
    public void addClient(Client client) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(client);
            session.getTransaction().commit();
            logger.info("\nAdded CLIENT" + client.toString());
        } catch (Exception e) {
            if(session.getTransaction() != null) {
                logger.info("\n Transaction rollbacked");
                session.getTransaction().rollback();
            }
        } finally {
            if(session != null) {
                session.close();
            }
        }
    }

    @Override
    public void deleteClient(Client client) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(client);
            session.getTransaction().commit();
            logger.info("\nDelete CLIENT" + client.toString());
        } catch (Exception e) {
            if(session.getTransaction() != null) {
                logger.info("\n Transaction rollbacked");
                session.getTransaction().rollback();
            }
        } finally {
            if(session != null) {
                session.close();
            }
        }
    }
}
