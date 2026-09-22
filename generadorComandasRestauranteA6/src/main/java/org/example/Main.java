package org.example;

public class Main {

    public static void main(String[] args) {

        FactoryComanda factoryDomicilio = new FactoryDomicilio(
                "Santiago",
                35000,
                "Barrio Laureles",
                "Carlos",
                5000
        );

        Comanda domicilio = factoryDomicilio.crearComanda();
        domicilio.mostrarComanda();

        System.out.println();

        FactoryComanda factorySalon = new FactorySalon(
                "Juan",
                45000,
                8,
                "Andres"
        );

        Comanda salon = factorySalon.crearComanda();
        salon.mostrarComanda();

        System.out.println();

        FactoryComanda factoryParaLlevar = new FactoryParaLlevar(
                "Maria",
                30000,
                20,
                2
        );

        Comanda paraLlevar = factoryParaLlevar.crearComanda();
        paraLlevar.mostrarComanda();
    }
}