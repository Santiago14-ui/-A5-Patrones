package org.example;

/**
 * Fabrica para crear tiquetes urbanos.
 */
public class FactoryUrbano extends FactoryTicket {

    private String pasajero;
    private double tarifaFija;

    public FactoryUrbano(String pasajero, double tarifaFija) {
        this.pasajero = pasajero;
        this.tarifaFija = tarifaFija;
    }

    @Override
    public Ticket crearTicket() {
        return new TicketUrbano(pasajero, tarifaFija);
    }
}