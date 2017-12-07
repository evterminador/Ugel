package com.chasquionline.ugel.login.repository.entity;

import com.chasquionline.ugel.bean.User;
import com.chasquionline.ugel.utils.UgelSession;
import com.chasquionline.ugel.utils.Dao;

import java.util.List;

public class UserDaoImpl implements Dao<User> {

    private UgelSession ugelSession;

    public UserDaoImpl() {
        ugelSession = new UgelSession();
    }

    public void save(User user) {

    }

    public void delete(User user) {

    }

    public void update(User user) {

    }

    public List<User> findAll() {
        return null;
    }

    public User findById(Integer id) {
        return null;
    }

    public User findByName(String name) {
        return null;
    }
}
