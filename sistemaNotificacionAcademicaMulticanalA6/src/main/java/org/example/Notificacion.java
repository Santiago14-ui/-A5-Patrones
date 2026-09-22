package org.example;

/**
 * Representa una notificación que puede ser enviada por diferentes canales.
 */
public interface Notificacion {

    void enviar(String destinatario, String mensaje);
}