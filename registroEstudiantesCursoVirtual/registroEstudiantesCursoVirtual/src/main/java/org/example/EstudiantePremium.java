package org.example;
/**
 * Hereda las características de un estudiante normal.
 */
public class EstudiantePremium extends Estudiante {

    public EstudiantePremium(String nombre, String correo, String telefono,
                             String direccion, String intereses) {
        super(nombre, correo, telefono, direccion, intereses);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante Premium");
        super.mostrarInformacion();
    }
}