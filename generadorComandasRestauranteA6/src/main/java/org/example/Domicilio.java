package org.example;

/**
 * Comanda para servicio a domicilio.
 */
public class Domicilio extends Comanda {

    private String direccion;
    private String repartidor;
    private double envio;

    public Domicilio(String cliente, double subtotal,
                     String direccion, String repartidor, double envio) {

        super(cliente, subtotal);
        this.direccion = direccion;
        this.repartidor = repartidor;
        this.envio = envio;
    }

    @Override
    public double total() {
        return subtotal + envio;
    }

    @Override
    public void mostrarComanda() {

        System.out.println(" COMANDA DOMICILIO ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Direccion: " + direccion);
        System.out.println("Repartidor: " + repartidor);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Envio: $" + envio);
        System.out.println("Total: $" + total());
    }
}