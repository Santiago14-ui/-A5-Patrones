package org.example;

/**
 * Notificación enviada mediante Push.
 */
public class Push implements Notificacion {

    private Prioridad prioridad;

    public Push(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {

        System.out.println("Enviando notificación Push...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Mensaje: " + mensaje);
    }
}