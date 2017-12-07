package com.chasquionline.ugel.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {

    private static final String URL = "jdbc:mysql://localhost:3306/ugel06";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public Connection getConexion() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
