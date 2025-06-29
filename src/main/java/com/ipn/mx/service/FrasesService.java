package com.ipn.mx.service;

import com.ipn.mx.domain.entidades.Frases;
import java.util.List;

public interface FrasesService {
    public List<Frases> readall();
    public Frases FindById(long idFrase);
    public Frases save(Frases frase);
    public void delete(long idFrase);

    public Frases obtenerFraseAleatoria();

}