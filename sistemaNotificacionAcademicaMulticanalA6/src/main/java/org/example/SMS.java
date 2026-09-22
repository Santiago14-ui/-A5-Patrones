package org.example;

/**
 * Notificación enviada por SMS.
 */
public class SMS implements Notificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {

        if (destinatario.length() < 3 ||
                destinatario.charAt(0) != '+' ||
                destinatario.charAt(1) != '5' ||
                destinatario.charAt(2) != '7') {

            System.out.println("El número debe tener el prefijo +57.");
            return;
        }

        if (mensaje.length() > 160) {
            System.out.println("El mensaje no puede superar los 160 caracteres.");
            return;
        }

        System.out.println("Enviando SMS...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}