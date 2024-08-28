package org.example.dao;

import org.example.models.Person;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class PersonDao implements Dao<Person> {

    @Override
    public void insert(Person person) {
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Person> selectAll() {
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();
            return session.createQuery("from Person", Person.class).list();
        }
    }

    public void showAllPersons() {
        selectAll().forEach(System.out::println);
    }
}