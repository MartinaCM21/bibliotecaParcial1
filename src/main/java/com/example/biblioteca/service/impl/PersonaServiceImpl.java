package com.example.biblioteca.service.impl;

import com.example.biblioteca.entity.Persona;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.repository.PersonaRepository;
import com.example.biblioteca.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository1;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository1) {
        super(baseRepository);
        this.personaRepository1 = personaRepository1;
    }

    @Override
    public Page<Persona> searchNombre(String nombre, Pageable pageable) throws Exception {
        try{
            return personaRepository1.searchNombre(nombre, pageable);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}