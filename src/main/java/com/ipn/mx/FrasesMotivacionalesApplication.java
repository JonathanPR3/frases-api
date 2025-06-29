package com.ipn.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.ipn.mx.domain.entidades.Frases;
import com.ipn.mx.domain.repositorios.FrasesRepository;

@SpringBootApplication
public class FrasesMotivacionalesApplication implements CommandLineRunner {

    @Autowired
    private FrasesRepository dao;

    public static void main(String[] args) {
        SpringApplication.run(FrasesMotivacionalesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Frase inicial
        Frases f = new Frases();
        f.setTextoFrase("Yo solo sé que no sé Java.");
        f.setAutorFrase("Sócrates");
        dao.save(f);

        // Lista de frases adicionales con ID null para que se generen automáticamente
        List<Frases> frases = List.of(
            new Frases(null, "El éxito es la suma de pequeños esfuerzos repetidos cada día.", "Robert Collier"),
            new Frases(null, "No cuentes los días, haz que los días cuenten.", "Muhammad Ali"),
            new Frases(null, "Haz hoy lo que otros no quieren, haz mañana lo que otros no pueden.", "Jerry Rice"),
            new Frases(null, "Cree que puedes y ya estás a medio camino.", "Theodore Roosevelt")
        );

        frases.forEach(dao::save);

        // Verificación de frases guardadas
        System.out.println("Frases insertadas en la base de datos:");
        dao.findAll().forEach(System.out::println);
    }
}
