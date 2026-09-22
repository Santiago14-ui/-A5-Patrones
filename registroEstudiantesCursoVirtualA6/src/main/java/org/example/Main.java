package org.example;

public class Main {

    public static void main(String[] args) {

        FactoryTicket factoryUrbano =
                new FactoryUrbano("Santiago", 3500);

        Ticket urbano = factoryUrbano.crearTicket();
        urbano.imprimirTicket();

        System.out.println();

        FactoryTicket factoryIntermunicipal =
                new FactoryIntermunicipal(
                        "Juan",
                        10000,
                        80,
                        500,
                        15
                );

        Ticket intermunicipal = factoryIntermunicipal.crearTicket();
        intermunicipal.imprimirTicket();

        System.out.println();

        FactoryTicket factoryTuristico =
                new FactoryTuristico(
                        "Maria",
                        150000,
                        "Carlos",
                        20000
                );

        Ticket turistico = factoryTuristico.crearTicket();
        turistico.imprimirTicket();
    }
}