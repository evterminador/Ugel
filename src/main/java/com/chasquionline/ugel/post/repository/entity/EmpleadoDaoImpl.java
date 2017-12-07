package com.chasquionline.ugel.post.repository.entity;

import com.chasquionline.ugel.bean.Empleado;
import com.chasquionline.ugel.utils.Dao;
import com.chasquionline.ugel.utils.UgelSession;

import java.util.List;

public class EmpleadoDaoImpl implements Dao<Empleado> {

    private UgelSession ugelSession;

    public EmpleadoDaoImpl() {
        ugelSession = new UgelSession();
    }

    public void save(Empleado empleado) {

    }

    public void delete(Empleado clazz) {

    }

    public void update(Empleado clazz) {

    }

    public List<Empleado> findAll() {
        return null;
    }

    public Empleado findById(Integer id) {
        return null;
    }

    public Empleado findByName(String name) {
        return null;
    }
}
