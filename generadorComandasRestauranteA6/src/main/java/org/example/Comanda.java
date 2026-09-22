package org.example;

/**
 * Comanda de restaurante.
 */
public abstract class Comanda {

    protected String cliente;
    protected double subtotal;

    public Comanda(String cliente, double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public abstract void mostrarComanda();

    public double total() {
        return subtotal;
    }
}