package ru.kulinchenko.structural.decorator;

public class Button implements Component {

    @Override
    public void draw() {
        System.out.println("Draw button");
    }
}
