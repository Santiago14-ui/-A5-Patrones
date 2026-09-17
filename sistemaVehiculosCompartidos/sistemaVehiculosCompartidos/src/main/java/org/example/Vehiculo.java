package org.example;

/**
 * Representa un vehículo de la empresa.
 */
public class Vehiculo implements ClonableVehiculo {

    protected String tipo;
    protected String placa;
    protected String color;
    protected int capacidad;
    protected String accesorios;

    public Vehiculo(String tipo, String placa, String color,
                    int capacidad, String accesorios) {
        this.tipo = tipo;
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;
        this.accesorios = accesorios;
    }

    /**
     * Crea una copia del vehículo actual.
     */
    @Override
    public Vehiculo clonar() {
        return new Vehiculo(tipo, placa, color, capacidad, accesorios);
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Accesorios: " + accesorios);
    }
}