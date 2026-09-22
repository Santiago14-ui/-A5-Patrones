package org.example;

/**
 *Notificación enviada por correo electrónico.
 */
public class Email implements Notificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {

        boolean tieneArroba = false;
        boolean tieneDominio = false;

        for (int i = 0; i < destinatario.length(); i++) {

            if (destinatario.charAt(i) == '@') {
                tieneArroba = true;
            }

            if (destinatario.charAt(i) == '.') {
                tieneDominio = true;
            }
        }

        if (!tieneArroba || !tieneDominio) {
            System.out.println("El correo electrónico no es válido.");
            return;
        }

        System.out.println("Enviando correo electrónico...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}