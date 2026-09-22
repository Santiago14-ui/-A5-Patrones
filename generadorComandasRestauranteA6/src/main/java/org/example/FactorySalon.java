package org.example;

/**
 * Fabrica para crear comandas de salon.
 */
public class FactorySalon extends FactoryComanda {

    private String cliente;
    private double subtotal;
    private int numeroMesa;
    private String mesero;

    public FactorySalon(String cliente, double subtotal,
                        int numeroMesa, String mesero) {

        this.cliente = cliente;
        this.subtotal = subtotal;
        this.numeroMesa = numeroMesa;
        this.mesero = mesero;
    }

    @Override
    public Comanda crearComanda() {

        return new Salon(
                cliente,
                subtotal,
                numeroMesa,
                mesero
        );
    }
}