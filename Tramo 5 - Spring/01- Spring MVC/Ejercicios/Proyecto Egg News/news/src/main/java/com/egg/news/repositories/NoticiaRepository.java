package com.egg.news.repositories;

import com.egg.news.entities.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, String> {

    @Query("""
            SELECT n
            FROM Noticia n
            WHERE n.activo = true
            """)
    List<Noticia> findByActivoTrue();

    @Query("""
            SELECT n
            FROM Noticia n
            WHERE n.activo = true
            ORDER BY n.fecha DESC
            """)
    public List<Noticia> findByFechaDesc();

}