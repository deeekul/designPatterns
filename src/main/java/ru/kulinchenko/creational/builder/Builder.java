package ru.kulinchenko.creational.builder;

public class Builder {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Ford", "Focus").setColor("Black").build();
        System.out.println(car);
    }
}

class Car {

    private String brand;

    private String model;

    private int year;

    private String color;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car: {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    static class CarBuilder {

        private String brand;

        private String model;

        private int year;

        private String color;

        /* Конструктор для обязательных полей*/
        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        /* Сеттер метод для дополнительного поля */
        CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        /* Сеттер метод для дополнительного поля */
        CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            return new Car(this);
        }
    }
}
