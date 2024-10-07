package ru.kulinchenko.creational.abstractFactory;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Drive speed 50 km/h...");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped...");
    }
}
