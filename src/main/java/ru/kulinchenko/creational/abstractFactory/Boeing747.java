package ru.kulinchenko.creational.abstractFactory;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boeing747 is flying...");;
    }
}
