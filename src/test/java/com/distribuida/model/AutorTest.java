package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor(
                1L,
                "Alex",
                "Yar",
                "Ecuatoriana",
                LocalDate.of(1990, 5, 15)
        );
    }

    @Test
    public void testAutorConstructorAndGetters() {
        assertAll("Validar datos del autor",
                () -> assertEquals(1L, autor.getId()),
                () -> assertEquals("Alex", autor.getNombre()),
                () -> assertEquals("Yar", autor.getApellido())
        );
        System.out.println("========== Test unitarias en Autor ==========");
        System.out.println(autor.getNombreCompleto());
    }

    @Test
    public void testAutorSetters() {
        autor.setId(2L);
        autor.setNombre("Juan");
        autor.setApellido("Taipe");

        assertAll("Pruebas unitarias setters Autor",
                () -> assertEquals(2L, autor.getId()),
                () -> assertEquals("Juan", autor.getNombre()),
                () -> assertEquals("Taipe", autor.getApellido())
        );
    }

    @Test
    public void testNombreCompleto() {
        String nombreCompleto = autor.getNombreCompleto();
        assertAll("Validar nombre completo del autor",
                () -> assertNotNull(nombreCompleto),
                () -> assertTrue(nombreCompleto.contains("Alex")),
                () -> assertTrue(nombreCompleto.contains("Yar")),
                () -> assertEquals("Alex Yar", nombreCompleto)
        );
    }

    @Test
    public void testConstructorVacio() {
        Autor autorVacio = new Autor();
        assertNotNull(autorVacio);
    }
}