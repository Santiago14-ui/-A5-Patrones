package org.example;

/**
 * Tiquete para una ruta urbana.
 */
public class TicketUrbano extends Ticket {

    private double tarifaFija;

    public TicketUrbano(String pasajero, double tarifaFija) {
        super(pasajero);
        this.tarifaFija = tarifaFija;
    }

    @Override
    public double calcularTarifa() {
        return tarifaFija;
    }

    @Override
    public void imprimirTicket() {
        System.out.println(" TICKET URBANO ");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Tarifa: $" + calcularTarifa());
        System.out.println("No tiene silla numerada.");
    }
}