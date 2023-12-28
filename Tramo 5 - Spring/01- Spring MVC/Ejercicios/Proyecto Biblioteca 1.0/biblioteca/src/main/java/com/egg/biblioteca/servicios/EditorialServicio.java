package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    public void crearEditorial(String nombre) throws MiExcepcion {

        validar(nombre);

        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);

        editorialRepositorio.save(editorial);
    }

    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = new ArrayList<>();
        editoriales = editorialRepositorio.findAll();

        return editoriales;
    }

    public void modificarEditorial(String id, String nombre) throws MiExcepcion {

        validar(nombre);

        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(id);

        Editorial editorial = new Editorial();

        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
            editorial.setNombre(nombre);

            editorialRepositorio.save(editorial);
        }
    }

    public void validar (String nombre) throws MiExcepcion {

        if(nombre.trim().isEmpty() || nombre == null) {
            throw new MiExcepcion("El nombre no puede estar vacio ni nulo.");
        }
    }

}
