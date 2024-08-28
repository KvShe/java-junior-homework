package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Person {
    @Id
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
