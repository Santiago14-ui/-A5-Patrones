package org.example;

/**
 * Comanda para servicio en salon.
 */
public class Salon extends Comanda {

    private int numeroMesa;
    private String mesero;

    public Salon(String cliente, double subtotal,
                 int numeroMesa, String mesero) {

        super(cliente, subtotal);
        this.numeroMesa = numeroMesa;
        this.mesero = mesero;
    }

    @Override
    public void mostrarComanda() {

        System.out.println(" COMANDA SALON ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Mesa: " + numeroMesa);
        System.out.println("Mesero: " + mesero);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total: $" + total());
    }
}