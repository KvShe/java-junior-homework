package org.example.utils;

import lombok.Getter;
import org.example.models.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    @Getter
    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class);

        sessionFactory = configuration.buildSessionFactory();
    }
}
