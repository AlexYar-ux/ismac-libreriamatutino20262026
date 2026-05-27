package com.distribuida.model;

import java.util.List;
import java.util.ArrayList;

public class Categoria {

    // Atributos privados
    private Long idCategoria;
    private String nombre;
    private String descripcion;
    private boolean activa;
    private List subcategorias; // Opcional: para jerarquías

    // Constructor vacío
    public Categoria() {
        this.subcategorias = new ArrayList<>();
    }

    // Constructor con parámetros esenciales
    public Categoria(Long id, String nombre, String descripcion, boolean activa) {
        this.idCategoria = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = activa;
        this.subcategorias = new ArrayList<>();
    }

    // Métodos Getter y Setter
    public Long getId() {
        return idCategoria;
    }

    public void setId(Long id) {
        this.idCategoria = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActiva() { // Nota: para booleanos se suele usar 'is' en lugar de 'get'
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }

    // Método para añadir una subcategoría fácilmente
    public void agregarSubcategoria(Categoria subcategoria) {
        this.subcategorias.add(subcategoria);
    }
}