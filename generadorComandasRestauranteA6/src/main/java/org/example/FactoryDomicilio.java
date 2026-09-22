package org.example;

/**
 * Fabrica para crear comandas a domicilio.
 */
public class FactoryDomicilio extends FactoryComanda {

    private String cliente;
    private double subtotal;
    private String direccion;
    private String repartidor;
    private double envio;

    public FactoryDomicilio(String cliente, double subtotal,
                            String direccion, String repartidor,
                            double envio) {

        this.cliente = cliente;
        this.subtotal = subtotal;
        this.direccion = direccion;
        this.repartidor = repartidor;
        this.envio = envio;
    }

    @Override
    public Comanda crearComanda() {

        return new Domicilio(
                cliente,
                subtotal,
                direccion,
                repartidor,
                envio
        );
    }
}