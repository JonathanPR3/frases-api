package com.ipn.mx.domain.entidades;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Frases implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFrase", nullable = false)
    private Long id;

    @Column(name = "textoFrase", nullable = false, length = 500)
    private String textoFrase;

    @Column(name = "autorFrase", nullable = false, length = 100)
    private String autorFrase;
}
