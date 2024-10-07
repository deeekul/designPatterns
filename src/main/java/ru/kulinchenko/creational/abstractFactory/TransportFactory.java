package ru.kulinchenko.creational.abstractFactory;

/* Абстрактная фабрика по созданию транспортных средств
 * Не знает, какие именно объекты будут создаваться. */
public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();
}
