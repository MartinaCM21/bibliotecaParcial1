package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Persona;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:nombre%"
    )
    Page<Persona> searchNombre(@Param("nombre") String nombre, Pageable pageable);
}
