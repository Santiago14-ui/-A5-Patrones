package org.example;

/**
 *Operaciones para construir un vehículo.
 */
public interface ConstruccionVehiculo {

    ConstruccionVehiculo color(String color);

    ConstruccionVehiculo capacidad(int capacidad);

    ConstruccionVehiculo accesorios(String accesorios);

    Vehiculo build();
}