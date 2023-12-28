package com.egg.biblioteca.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Imagen {

    @Id
    @GeneratedValue(generator = "UUID") // UUID (Identificadores Únicos Universales)
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;

    // Asigna el formato de archivo de la imagen
    private String mime;

    private String nombre;

    @Lob // @Lob => puede ser un archivo pesado
    @Basic(fetch = FetchType.LAZY) // LAZY => se va a cargar solo cuando sea solicitado
    @Column(name = "contenido", columnDefinition = "MEDIUMBLOB") // mediumblob => 16 MB
    private byte[] contenido;

    public Imagen() {}

    public String getId() {
        return id;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
