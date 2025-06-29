package com.ipn.mx.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ipn.mx.domain.entidades.Frases;
import com.ipn.mx.service.FrasesService;

@RestController
@RequestMapping("/api/frases")
public class FrasesController {

    @Autowired
    private FrasesService service;

    // Obtener todas las frases
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Frases> getAllFrases() {
        return service.readall();
    }

    // Obtener una frase por ID
    @GetMapping("/{idFrase}")
    @ResponseStatus(HttpStatus.OK)
    public Frases read(@PathVariable long idFrase) {
        return service.FindById(idFrase);
    }

    // Obtener una frase aleatoria
    @GetMapping("/aleatoria")
    @ResponseStatus(HttpStatus.OK)
    public Frases getFraseAleatoria() {
        return service.obtenerFraseAleatoria();
    }
}
