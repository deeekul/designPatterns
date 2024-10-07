package ru.kulinchenko.creational.abstractFactory;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {
        if (true) {
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }

        Aircraft aircraft = factory.createAircraft();
        aircraft.flight();

        Car car = factory.createCar();
        car.drive();
    }
}
