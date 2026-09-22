package org.example;

/**
 * Crea notificaciones de tipo Email.
 */
public class FactoryEmail extends FactoryNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}