package ru.kulinchenko.creational.factoryMethod;

public class NewJeep extends Jeep {

    public void newFunction() {
        System.out.println("New function");
    }

    @Override
    public void drive() {
        System.out.println("Drive speed 65 km/h...");
    }
}
