package org.example;

/**
 * Se encarga de crear copias de libros utilizando la abstracción
 */
public class Personalizador {

    /**
     * Crea una copia del libro recibido.
     */
    public LibroPrototype crearCopia(LibroPrototype libro) {
        return libro.clonar();
    }
}