package com.chasquionline.ugel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Colegio implements Serializable {

    private Integer id;
    private Integer modular;
    private String nombre;
    private String referencia;
    private String direccion;
    private String web;
    private String rdCreacion;
    private String turno;
    private String nivel;
    private String gestion;
    private String modalidad;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Colegio(Integer modular, String nombre, String referencia, String direccion, String web, String rdCreacion,
                   String turno, String nivel, String gestion, String modalidad) {
        super();
        this.modular = modular;
        this.nombre = nombre;
        this.referencia = referencia;
        this.direccion = direccion;
        this.web = web;
        this.rdCreacion = rdCreacion;
        this.turno = turno;
        this.nivel = nivel;
        this.gestion = gestion;
        this.modalidad = modalidad;
    }

    public Colegio() {
        super();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModular() {
        return modular;
    }

    public void setModular(Integer modular) {
        this.modular = modular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getRdCreacion() {
        return rdCreacion;
    }

    public void setRdCreacion(String rdCreacion) {
        this.rdCreacion = rdCreacion;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
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
