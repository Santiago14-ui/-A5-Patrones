package org.example;

public class Main {

    public static void main(String[] args) {

        // Los dos jugadores acceden a la misma configuración
        ConfiguracionJuego configuracion1 =
                ConfiguracionJuego.getInstancia();

        ConfiguracionJuego configuracion2 =
                ConfiguracionJuego.getInstancia();

        System.out.println("Configuración inicial:");
        configuracion1.mostrarConfiguraciones();

        // Cambiamos una configuración desde el jugador 1
        configuracion1.cambiarConfiguracion("Dificultad", "Facil");

        System.out.println("\nDespués de cambiar la dificultad:");
        configuracion2.mostrarConfiguraciones();

        // Agregamos una nueva configuración
        configuracion1.agregarConfiguracion("Resolución", "1920x1080");

        System.out.println("\nConfiguración final:");
        configuracion1.mostrarConfiguraciones();


        if (configuracion1 == configuracion2) {
            System.out.println("\nLos dos jugadores usan la misma configuración.");
        } else {
            System.out.println("\nLos jugadores tienen configuraciones diferentes.");
        }
    }
}
