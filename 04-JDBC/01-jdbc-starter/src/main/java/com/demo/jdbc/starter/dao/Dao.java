package com.demo.jdbc.starter.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<K, E> {
    E save(E ticket);

    void update(E ticket);

    boolean delete(K id);

    Optional<E> findById(K id);

    List<E> findAll();
}
