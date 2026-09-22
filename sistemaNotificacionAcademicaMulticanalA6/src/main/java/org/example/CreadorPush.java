package org.example;

/**
 * Crea notificaciones de tipo Push.
 */
public class CreadorPush extends CreadorNotificacion {

    private Prioridad prioridad;

    public CreadorPush(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public Notificacion crearNotificacion() {
        return new Push(prioridad);
    }
}