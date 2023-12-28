package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiExcepcion;
import com.egg.biblioteca.servicios.AutorServicio;
import com.egg.biblioteca.servicios.EditorialServicio;
import com.egg.biblioteca.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar") // localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {

        cargarModeloConAutoresYEditoriales(modelo);

        return "libro_form.html";
    }

    @PostMapping("/registro") // localhost:8080/libro/registro
    public String registro(@RequestParam(required=false) Long isbn, @RequestParam String titulo,
                            @RequestParam(required=false) Integer ejemplares, @RequestParam String idAutor,
                             @RequestParam String idEditorial, ModelMap modelo) {
        try {

            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial); // intenta crear el libro

            cargarModeloConAutoresYEditoriales(modelo); // Carga el modelo con las listas de autores y editoriales

            modelo.put("exito", "El Libro fue cargado correctamente!"); // carga el modelo con un mensaje exitoso

        } catch (MiExcepcion ex) {

            cargarModeloConAutoresYEditoriales(modelo); // Carga el modelo con las listas de autores y editoriales

            modelo.put("error", ex.getMessage()); // carga el modelo con un mensaje de error

            return "libro_form.html"; // volvemos a cargar el formulario
        }
        return "libro_form.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Libro> libros = libroServicio.listarLibros();

        modelo.addAttribute("libros",libros);

        return "libro_list.html";
    }

    public void cargarModeloConAutoresYEditoriales(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("autores",autores);
        modelo.addAttribute("editoriales",editoriales);
    }

}
