package org.example;

/**
 * Crea notificaciones de tipo SMS.
 */
public class FactorySMS extends FactoryNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}