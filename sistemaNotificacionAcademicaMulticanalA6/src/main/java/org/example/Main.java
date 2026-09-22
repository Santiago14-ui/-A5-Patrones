package org.example;

public class Main {

    public static void main(String[] args) {

        CreadorNotificacion creadorEmail = new CreadorEmail();

        creadorEmail.enviarNotificacion(
                "santiago@uniquindio.edu.co",
                "Tiene una nueva actividad académica."
        );

        System.out.println();

        CreadorNotificacion creadorSMS = new CreadorSMS();

        creadorSMS.enviarNotificacion(
                "+573001234567",
                "Tiene una nueva notificación académica."
        );

        System.out.println();

        CreadorNotificacion creadorPush =
                new CreadorPush(Prioridad.ALTA);

        creadorPush.enviarNotificacion(
                "Santiago",
                "Tiene una actividad pendiente."
        );
    }
}