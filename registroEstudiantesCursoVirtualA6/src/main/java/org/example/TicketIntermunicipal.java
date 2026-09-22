package org.example;

/**
 * Tiquete para una ruta intermunicipal.
 */
public class TicketIntermunicipal extends Ticket {

    private double tarifaBase;
    private double kilometros;
    private double costoKm;
    private int numeroSilla;

    public TicketIntermunicipal(String pasajero, double tarifaBase,
                                double kilometros, double costoKm,
                                int numeroSilla) {

        super(pasajero);
        this.tarifaBase = tarifaBase;
        this.kilometros = kilometros;
        this.costoKm = costoKm;
        this.numeroSilla = numeroSilla;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase + (kilometros * costoKm);
    }

    @Override
    public void imprimirTicket() {
        System.out.println(" TICKET INTERMUNICIPAL ");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Kilometros: " + kilometros);
        System.out.println("Silla: " + numeroSilla);
        System.out.println("Tarifa: $" + calcularTarifa());
    }
}