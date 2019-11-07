package com.krasikov.utils;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.krasikov.domain.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(Client.class);
        cfg.addAnnotatedClass(Contract.class);
        cfg.addAnnotatedClass(MobileNumber.class);
        cfg.addAnnotatedClass(Option.class);
        cfg.addAnnotatedClass(Tariff.class);
        cfg.addAnnotatedClass(Worker.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
