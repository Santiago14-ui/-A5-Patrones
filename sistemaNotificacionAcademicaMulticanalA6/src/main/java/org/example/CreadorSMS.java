package org.example;

/**
 * Crea notificaciones de tipo SMS.
 */
public class CreadorSMS extends CreadorNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}