package com.egg.news.controllers;

import com.egg.news.entities.Noticia;
import com.egg.news.exceptions.MyException;
import com.egg.news.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/") // localhost:8080/noticias/
    public String inicio(ModelMap modelo) {
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
            return "noticia_form.html";
        }

        return "noticia_form.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Noticia> noticias = noticiaService.listarNoticias();

        modelo.addAttribute("noticias", noticias);

        return "noticia_list.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {

        modelo.put("noticia", noticiaService.listarPorId(id));
        return "noticia_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo) {
        try {
            noticiaService.modificarNoticia(id, titulo, cuerpo);
            return "redirect:../lista"; // ../lista => noticia/lista

        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            return "noticia_modificar.html";
        }
    }

}