package com.chasquionline.ugel.utils;

import com.chasquionline.ugel.utils.Connexion;

import java.sql.Connection;

public class UgelSession {

    private Connection session;

    public UgelSession() {
        session = new Connexion().getConexion();
    }

    public Connection getSession() {
        return session;
    }
}
