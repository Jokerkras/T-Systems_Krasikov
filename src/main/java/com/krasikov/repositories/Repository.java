//package com.krasikov.repositories;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class Repository {
////    private static final Logger log = Logger.getAnonymousLogger();
//
//    private static final ThreadLocal sessionThread = new ThreadLocal();
//    private static final SessionFactory sessionFactory = new Configuration().configure("config/hibernate.cfg.xml").buildSessionFactory();
//
//    protected Repository() {
//    }
//
//    public static Session getSession()
//    {
//        Session session = (Session) Repository.sessionThread.get();
//
//        if (session == null)
//        {
//            session = sessionFactory.openSession();
//            Repository.sessionThread.set(session);
//        }
//        return session;
//    }
//
//    protected void begin() {
//        getSession().beginTransaction();
//    }
//
//    protected void commit() {
//        getSession().getTransaction().commit();
//    }
//
//    protected void rollback() {
//        try {
//            getSession().getTransaction().rollback();
//        } catch (HibernateException e) {
////            log.log(Level.WARNING, "Cannot rollback", e);
//        }
//        try {
//            getSession().close();
//        } catch (HibernateException e) {
////            log.log(Level.WARNING, "Cannot close", e);
//        }
//        Repository.sessionThread.set(null);
//    }
//
//    public static void close() {
//        getSession().close();
//        Repository.sessionThread.set(null);
//    }
//}
