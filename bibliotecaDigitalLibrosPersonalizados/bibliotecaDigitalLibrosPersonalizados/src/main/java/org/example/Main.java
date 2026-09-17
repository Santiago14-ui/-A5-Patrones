package org.example;

public class Main {

    public static void main(String[] args) {

        Libro libroOriginal = new Libro(
                "El Principito",
                "Santiago Del Toro",
                "Historia de un pequeño príncipe."
        );

        Personalizador personalizador = new Personalizador();

        LibroPrototype copia = personalizador.crearCopia(libroOriginal);

        ((Libro) copia).cambiarTitulo("El Principito - Mi copia");

        System.out.println(" Libro original ");
        libroOriginal.mostrarInformacion();

        System.out.println();

        System.out.println(" Libro copiado ");
        ((Libro) copia).mostrarInformacion();

        if (libroOriginal != copia) {
            System.out.println("\nLa copia es diferente al original.");
        }
    }
}