package org.example;

/**
 * Creador de las notificaciones
 */
public abstract class CreadorNotificacion {

    public abstract Notificacion crearNotificacion();

    public void enviarNotificacion(String destinatario, String mensaje) {

        Notificacion notificacion = crearNotificacion();

        notificacion.enviar(destinatario, mensaje);
    }
}