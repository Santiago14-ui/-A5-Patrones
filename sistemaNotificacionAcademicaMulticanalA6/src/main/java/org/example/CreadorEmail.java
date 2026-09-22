package org.example;

/**
 * Crea notificaciones de tipo Email.
 */
public class CreadorEmail extends CreadorNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}