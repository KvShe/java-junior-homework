package org.example;

import org.example.dao.PersonDao;
import org.example.models.Person;

import java.util.List;

/**
 * Настройте связь между вашим приложением и базой данных с использованием Hibernate.
 * Создайте несколько объектов Person и сохраните их в базу данных
 */
public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();

        createPersons().forEach(personDao::insert);
        personDao.showAllPersons();
    }

    private static List<Person> createPersons() {
        return List.of(
                new Person(1, "Jonny", 40),
                new Person(2, "Arthur", 37),
                new Person(3, "Sofia", 30),
                new Person(4,"Yulia", 33)
        );
    }
}