package org.example;

/**
 * Crea notificaciones de tipo Push.
 */
public class FactoryPush extends FactoryNotificacion {

    private Prioridad prioridad;

    public FactoryPush(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public Notificacion crearNotificacion() {
        return new Push(prioridad);
    }
}