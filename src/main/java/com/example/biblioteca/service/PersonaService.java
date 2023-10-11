package com.example.biblioteca.service;

import com.example.biblioteca.entity.Persona;
import org.springframework.data.domain.*;


import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> {
    Page<Persona> searchNombre(String filtro, Pageable pageable) throws Exception;
}

