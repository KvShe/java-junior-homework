package org.example.dao;

import java.util.List;

public interface Dao<T> {

    void insert(T object);

    List<T> selectAll();
}