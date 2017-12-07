package com.chasquionline.ugel.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Empleado implements Serializable {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String celular;
    private String email;
    private Date fechaNacimiento;
    private String situacion;
    private String modalidad;
    private String nivel;
    private String gestion;
    private int escala;
    private int tipoEmpleado;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Empleado(String nombre, String apellidos, String dni, String celular, String email, Date fechaNacimiento, String situacion, String modalidad, String nivel, String gestion, int escala, int tipoEmpleado, Timestamp created_at, Timestamp updated_at) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.celular = celular;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.situacion = situacion;
        this.modalidad = modalidad;
        this.nivel = nivel;
        this.gestion = gestion;
        this.escala = escala;
        this.tipoEmpleado = tipoEmpleado;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Empleado() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
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

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
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
