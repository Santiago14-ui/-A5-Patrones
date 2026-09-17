package org.example;

/**
 * Representa un estudiante de la plataforma.
 */
public class Estudiante {

    protected String nombre;
    protected String correo;
    protected String telefono;
    protected String direccion;
    protected String intereses;

    public Estudiante(String nombre, String correo, String telefono,
                      String direccion, String intereses) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.intereses = intereses;
    }

    /**
     * Muestra los datos principales del estudiante.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Intereses: " + intereses);
    }
}