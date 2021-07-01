package com.vitalmix.model.sql;

import com.vitalmix.model.Starship;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {

    private static SessionFactory factory;

    public static void createSessionFactory() {
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Starship.class)
                .buildSessionFactory();
    }

    public static Session getCurrentSession() {
        return factory.getCurrentSession();
    }

    public static void closeFactory() {
        factory.close();
    }
}
