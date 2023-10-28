package com.egg.news.services;

import com.egg.news.entities.Noticia;
import com.egg.news.exceptions.MyException;
import com.egg.news.repositories.NoticiaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MyException {

        validar(titulo, cuerpo);

        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFecha(LocalDateTime.now());

        noticiaRepository.save(noticia);
    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepository.findAll();

        return noticias;
    }

    public void modificarNoticia (String id, String titulo, String cuerpo) throws MyException {

        validar(titulo, cuerpo);

        Optional<Noticia> respuesta = noticiaRepository.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);

            noticiaRepository.save(noticia);
        }
    }

    public Noticia listarPorId(String id) {
        return noticiaRepository.getOne(id);
    }

    public void validar (String titulo, String cuerpo) throws MyException {

        if (titulo.trim().isEmpty() || titulo == null) {
            throw new MyException("El titulo no puede estar vacio o ser nulo.");
        }

        if (cuerpo.trim().isEmpty() || cuerpo == null) {
            throw new MyException("El cuerpo no puede estar vacio o ser nulo.");
        }

    }
}
