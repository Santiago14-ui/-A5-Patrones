package org.example;

/**
 * Comanda para llevar.
 */
public class ParaLlevar extends Comanda {

    private int tiempoEstimado;
    private int empaquesNecesarios;

    public ParaLlevar(String cliente, double subtotal,
                      int tiempoEstimado, int empaquesNecesarios) {

        super(cliente, subtotal);
        this.tiempoEstimado = tiempoEstimado;
        this.empaquesNecesarios = empaquesNecesarios;
    }

    @Override
    public void mostrarComanda() {

        System.out.println(" COMANDA PARA LLEVAR ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
        System.out.println("Empaques necesarios: " + empaquesNecesarios);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total: $" + total());
    }
}