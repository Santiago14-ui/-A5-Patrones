package org.example;

/**
 * Fabrica para crear tiquetes turísticos.
 */
public class FactoryTuristico extends FactoryTicket {

    private String pasajero;
    private double precioPaquete;
    private String guia;
    private double seguro;

    public FactoryTuristico(String pasajero, double precioPaquete,
                            String guia, double seguro) {

        this.pasajero = pasajero;
        this.precioPaquete = precioPaquete;
        this.guia = guia;
        this.seguro = seguro;
    }

    @Override
    public Ticket crearTicket() {
        return new TicketTuristico(
                pasajero,
                precioPaquete,
                guia,
                seguro
        );
    }
}