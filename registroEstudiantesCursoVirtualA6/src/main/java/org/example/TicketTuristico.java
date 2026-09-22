package org.example;

/**
 * Tiquete para una ruta turística.
 */
public class TicketTuristico extends Ticket {

    private double precioPaquete;
    private String guia;
    private double seguro;

    public TicketTuristico(String pasajero, double precioPaquete,
                           String guia, double seguro) {

        super(pasajero);
        this.precioPaquete = precioPaquete;
        this.guia = guia;
        this.seguro = seguro;
    }

    @Override
    public double calcularTarifa() {

        double subtotal = precioPaquete + seguro;

        return subtotal + (subtotal * 0.08);
    }

    @Override
    public void imprimirTicket() {
        System.out.println(" TICKET TURISTICO ");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Guia: " + guia);
        System.out.println("Seguro: $" + seguro);
        System.out.println("Impuesto: 8%");
        System.out.println("Tarifa: $" + calcularTarifa());
    }
}