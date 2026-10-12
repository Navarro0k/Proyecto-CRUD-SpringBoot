package com.navarro.proyectorepaso.model;

public class Tarea {

    private Long id;
    private String nombre;
    private boolean completada;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}
