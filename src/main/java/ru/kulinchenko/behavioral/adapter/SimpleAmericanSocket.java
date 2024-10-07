package ru.kulinchenko.behavioral.adapter;

/* Класс американской розетки, которая выдаёт напряжение 110 вольт. */
public class SimpleAmericanSocket implements AmericanSocket {

    @Override
    public void getPower() {
        System.out.println("Get 110 volt!");
    }
}
