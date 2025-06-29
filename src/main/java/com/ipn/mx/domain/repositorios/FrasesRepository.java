package com.ipn.mx.domain.repositorios;

import com.ipn.mx.domain.entidades.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query(value = "SELECT * FROM frases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Frases obtenerFraseAleatoria();
}
