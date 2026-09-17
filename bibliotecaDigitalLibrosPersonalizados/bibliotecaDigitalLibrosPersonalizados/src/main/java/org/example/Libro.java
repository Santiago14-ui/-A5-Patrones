package org.example;

/**
 * libro que puede ser clonado para crear copias personalizadas.
 */
public class Libro implements LibroPrototype {

    protected String titulo;
    protected String autor;
    protected String contenido;

    public Libro(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    /**
     * Crea una copia del libro actual.
     */
    @Override
    public LibroPrototype clonar() {
        return new Libro(titulo, autor, contenido);
    }

    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
    }
}