package com.example.biblioteca.controller;

import com.example.biblioteca.controller.impl.BaseControllerImpl;
import com.example.biblioteca.entity.Persona;
import com.example.biblioteca.service.impl.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
/*
    @GetMapping("/search")
    public ResponseEntity<?> searchNombre(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombre(filtro));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\""+e.getMessage()+"\"}"));
        }
    }
*/
    @GetMapping("/searchPaged")
    public ResponseEntity<?> searchNombre(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombre(filtro, pageable));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\""+e.getMessage()+"\"}"));
        }
    }


}
