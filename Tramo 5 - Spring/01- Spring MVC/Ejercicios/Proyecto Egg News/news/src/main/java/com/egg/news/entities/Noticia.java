package com.egg.news.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;


@Entity
public class Noticia {

    @Id
    @GeneratedValue(generator = "UUID") // UUID (Identificadores Únicos Universales)
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String cuerpo;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;

    private Boolean activo;

    public Noticia() {}

    public Noticia(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha = LocalDateTime.now();
        activo = true;
    }

    public void desactivarNoticia() {
        this.activo = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}