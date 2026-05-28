package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(
                1L,
                "Tecnología",
                "Libros sobre tecnología y programación",
                true
        );
    }

    @Test
    public void testCategoriaConstructorAndGetters() {
        assertAll("Validar datos de la categoria",
                () -> assertEquals(1L, categoria.getId()),
                () -> assertEquals("Tecnología", categoria.getNombre()),
                () -> assertEquals("Libros sobre tecnología y programación", categoria.getDescripcion()),
                () -> assertTrue(categoria.isActiva())
        );
        System.out.println("========== Test unitarias en Categoria ==========");
        System.out.println("ID: " + categoria.getId() + " | Nombre: " + categoria.getNombre());
    }

    @Test
    public void testCategoriaSetters() {
        categoria.setId(2L);
        categoria.setNombre("Ciencias");
        categoria.setDescripcion("Libros sobre ciencias naturales");
        categoria.setActiva(false);

        assertAll("Pruebas unitarias setters Categoria",
                () -> assertEquals(2L, categoria.getId()),
                () -> assertEquals("Ciencias", categoria.getNombre()),
                () -> assertEquals("Libros sobre ciencias naturales", categoria.getDescripcion()),
                () -> assertFalse(categoria.isActiva())
        );
    }

    @Test
    public void testAgregarSubcategoria() {
        Categoria sub = new Categoria(2L, "Programación", "Lenguajes de programación", true);

        categoria.agregarSubcategoria(sub);

        assertAll("Validar subcategoría agregada",
                () -> assertNotNull(categoria.getSubcategorias()),
                () -> assertEquals(1, categoria.getSubcategorias().size()),
                () -> assertTrue(categoria.getSubcategorias().contains(sub))
        );
    }

    @Test
    public void testConstructorVacio() {
        Categoria categoriaVacia = new Categoria();
        assertAll("Validar constructor vacío",
                () -> assertNotNull(categoriaVacia),
                () -> assertNotNull(categoriaVacia.getSubcategorias()),
                () -> assertTrue(categoriaVacia.getSubcategorias().isEmpty())
        );
    }
}