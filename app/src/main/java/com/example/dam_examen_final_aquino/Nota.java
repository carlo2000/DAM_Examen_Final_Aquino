package com.example.dam_examen_final_aquino;

public class Nota {
    private String titulo;
    private String contenido;
    private boolean favorita;

    public Nota(String titulo, String contenido, boolean favorita) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
}
