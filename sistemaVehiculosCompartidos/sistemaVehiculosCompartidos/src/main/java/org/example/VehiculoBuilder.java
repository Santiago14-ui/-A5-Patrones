package org.example;

/**
 * Permite construir vehículos agregando sus datos opcionales
 */
public class VehiculoBuilder implements ConstruccionVehiculo {

    private String tipo;
    private String placa;
    private String color;
    private int capacidad;
    private String accesorios;

    public VehiculoBuilder(String tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
    }

    @Override
    public ConstruccionVehiculo color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public ConstruccionVehiculo capacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    @Override
    public ConstruccionVehiculo accesorios(String accesorios) {
        this.accesorios = accesorios;
        return this;
    }

    /**
     * Construye el vehículo con los datos proporcionados.
     */
    @Override
    public Vehiculo build() {
        return new Vehiculo(tipo, placa, color, capacidad, accesorios);
    }
}