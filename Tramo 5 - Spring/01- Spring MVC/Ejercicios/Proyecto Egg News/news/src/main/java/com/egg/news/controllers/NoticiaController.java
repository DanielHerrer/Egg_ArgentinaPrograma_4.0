package com.egg.news.controllers;

import com.egg.news.entities.Noticia;
import com.egg.news.exceptions.MyException;
import com.egg.news.repositories.NoticiaRepository;
import com.egg.news.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;
    @Autowired
    private NoticiaRepository noticiaRepository;

    @GetMapping("/") // localhost:8080/noticias/
    public String inicio (ModelMap modelo) {
        List<Noticia> noticias = noticiaService.listarNoticias();

        modelo.addAttribute("noticias", noticias);

        return "noticia_inicio.html";
    }

    @GetMapping("/registrar") // localhost:8080/noticias/registrar
    public String registrar() {
        return "noticia_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo, ModelMap modelo) {
        try {
            noticiaService.crearNoticia(titulo, cuerpo);
            modelo.put("exito", "La Noticia se ha registrado correctamente!");

        } catch (MyException e) {
            modelo.put("error",e.getMessage());

        }

        return "noticia_form.html";
    }

    @GetMapping("/listar") // localhost:8080/noticias/listar
    public String listar(ModelMap modelo) {

        List<Noticia> noticias = noticiaService.listarNoticias();

        modelo.addAttribute("noticias", noticias);

        return "noticia_list.html";
    }

    @GetMapping("/modificar/{id}") // localhost:8080/noticias/modificar/abc-123-def-456-ghi-789
    public String modificar(@PathVariable String id, ModelMap modelo) {

        Noticia noticia = noticiaService.listarPorId(id);

        modelo.put("noticia", noticia);
        // Trae a la ventana de modificacion la noticia por su ID
        return "noticia_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo) {
        try {
            noticiaService.modificarNoticia(id, titulo, cuerpo);
            return "redirect:../listar"; // ../listar => noticias/listar

        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            return "noticia_modificar.html";
        }
    }

    // @DeleteMapping("/eliminar/{id}")
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo) {

        try {

            noticiaService.eliminarNoticia(id);
            modelo.put("exito", "La Noticia se ha eliminado correctamente!");

            List<Noticia> noticias = noticiaService.listarNoticias();
            modelo.addAttribute("noticias", noticias);

        } catch (MyException e) {
            modelo.put("error",e.getMessage());

        }

        return "noticia_list.html";
    }

}