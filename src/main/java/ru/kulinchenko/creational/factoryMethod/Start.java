package ru.kulinchenko.creational.factoryMethod;

public class Start {

    public static void main(String[] args) {
        Car car = CarSelector.getCarSelector().getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = CarSelector.getCarSelector().getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = CarSelector.getCarSelector().getCar(RoadType.LAWN);
        car.drive();
        car.stop();
    }
}
