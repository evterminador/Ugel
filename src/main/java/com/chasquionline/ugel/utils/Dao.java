package com.chasquionline.ugel.utils;

import java.util.List;

public interface Dao<T> {

    void save(T clazz);

    void delete(T clazz);

    void update(T clazz);

    List<T> findAll();

    T findById(Integer id);

    T findByName(String name);
}
