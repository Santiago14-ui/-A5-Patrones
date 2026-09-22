package org.example;

/**
 * Fabrica para crear tiquetes intermunicipales.
 */
public class FactoryIntermunicipal extends FactoryTicket {

    private String pasajero;
    private double tarifaBase;
    private double kilometros;
    private double costoKm;
    private int numeroSilla;

    public FactoryIntermunicipal(String pasajero, double tarifaBase,
                                 double kilometros, double costoKm,
                                 int numeroSilla) {

        this.pasajero = pasajero;
        this.tarifaBase = tarifaBase;
        this.kilometros = kilometros;
        this.costoKm = costoKm;
        this.numeroSilla = numeroSilla;
    }

    @Override
    public Ticket crearTicket() {
        return new TicketIntermunicipal(
                pasajero,
                tarifaBase,
                kilometros,
                costoKm,
                numeroSilla
        );
    }
}