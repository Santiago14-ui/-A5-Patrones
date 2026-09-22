package org.example;

/**
 * Fabrica para crear comandas para llevar.
 */
public class FactoryParaLlevar extends FactoryComanda {

    private String cliente;
    private double subtotal;
    private int tiempoEstimado;
    private int empaquesNecesarios;

    public FactoryParaLlevar(String cliente, double subtotal,
                             int tiempoEstimado,
                             int empaquesNecesarios) {

        this.cliente = cliente;
        this.subtotal = subtotal;
        this.tiempoEstimado = tiempoEstimado;
        this.empaquesNecesarios = empaquesNecesarios;
    }

    @Override
    public Comanda crearComanda() {

        return new ParaLlevar(
                cliente,
                subtotal,
                tiempoEstimado,
                empaquesNecesarios
        );
    }
}