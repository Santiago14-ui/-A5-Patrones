package org.example;

/**
 * Permite construir un estudiante tilizando datos obligatorios y opcionales.
 */
public class EstudianteBuilder {

    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String intereses;

    public EstudianteBuilder(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public EstudianteBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public EstudianteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public EstudianteBuilder intereses(String intereses) {
        this.intereses = intereses;
        return this;
    }

    /**
     * Construye y devuelve el estudiante con los datos proporcionados.
     */
    public Estudiante build() {
        return new Estudiante(nombre, correo, telefono, direccion, intereses);
    }
}