package org.example;

public class Main {

    public static void main(String[] args) {

        Vehiculo carro = new VehiculoBuilder("Carro", "ABC123")
                .color("Rojo")
                .capacidad(5)
                .accesorios("GPS")
                .build();

        System.out.println(" Vehículo original ");
        carro.mostrarInformacion();

        Vehiculo copia = carro.clonar();

        copia.cambiarColor("Negro");

        System.out.println("\n Vehículo personalizado ");
        copia.mostrarInformacion();

        if (carro != copia) {
            System.out.println("\nEl vehículo clonado es un objeto diferente al original.");
        }
    }
}