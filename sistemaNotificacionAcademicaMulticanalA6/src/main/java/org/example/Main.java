package org.example;

public class Main {

    public static void main(String[] args) {

        FactoryNotificacion creadorEmail = new FactoryEmail();

        creadorEmail.enviarNotificacion(
                "santiago@uniquindio.edu.co",
                "Tiene una nueva actividad académica."
        );

        System.out.println();

        FactoryNotificacion creadorSMS = new FactorySMS();

        creadorSMS.enviarNotificacion(
                "+573001234567",
                "Tiene una nueva notificación académica."
        );

        System.out.println();

        FactoryNotificacion creadorPush =
                new FactoryPush(Prioridad.ALTA);

        creadorPush.enviarNotificacion(
                "Santiago",
                "Tiene una actividad pendiente."
        );
    }
}