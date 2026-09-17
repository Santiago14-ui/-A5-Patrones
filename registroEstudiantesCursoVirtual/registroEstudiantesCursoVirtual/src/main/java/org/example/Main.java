package org.example;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new EstudianteBuilder(
                "Santiago",
                "santiago@gmail.com"
        )
                .telefono("3146695432")
                .direccion("Armenia")
                .intereses("Programación")
                .build();

        System.out.println(" Estudiante ");
        estudiante.mostrarInformacion();

        System.out.println();

        Estudiante estudiantePremium = new EstudiantePremium(
                "Juan",
                "juan@gmail.com",
                "3109876543",
                "Pereira",
                "Videojuegos"
        );

        estudiantePremium.mostrarInformacion();
    }
}