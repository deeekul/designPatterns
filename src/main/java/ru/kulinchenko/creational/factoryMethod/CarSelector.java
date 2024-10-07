package ru.kulinchenko.creational.factoryMethod;

/* Фабрика по созданию автомобилей */
public class CarSelector {

    /* Паттерн Singleton*/
    private static CarSelector carSelector;

    public static CarSelector getCarSelector() {
        if (carSelector == null) {
            carSelector = new CarSelector();
        }
        return carSelector;
    }

    private CarSelector() {

    }

    /* Фабричный метод, который создаёт нужный автомобиль */
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case LAWN:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
