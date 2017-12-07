package com.chasquionline.ugel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

    private Integer id;

    private int idEmp;

    private String email;

    private String password;

    private String rememberToken;

    private Timestamp created_at;

    private Timestamp updated_at;


    public User(int idEmp, String email, String password, String rememberToken, Timestamp created_at,
                Timestamp updated_at) {
        super();
        this.idEmp = idEmp;
        this.email = email;
        this.password = password;
        this.rememberToken = rememberToken;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setEmpleado(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
