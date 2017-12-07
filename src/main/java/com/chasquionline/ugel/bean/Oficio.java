package com.chasquionline.ugel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Oficio implements Serializable {

    private Integer id;
    private String tipo;
    private String direccion;
    private String telefono;
    private String nombre_anio;
    private String destinatario;
    private String pedido;
    private String requisitos;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Oficio(String tipo, String direccion, String telefono, String nombre_anio, String destinatario,
                  String pedido, String requisitos) {
        super();
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre_anio = nombre_anio;
        this.destinatario = destinatario;
        this.pedido = pedido;
        this.requisitos = requisitos;
    }

    public Oficio() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_anio() {
        return nombre_anio;
    }

    public void setNombre_anio(String nombre_anio) {
        this.nombre_anio = nombre_anio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
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
