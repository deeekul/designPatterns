package ru.kulinchenko.adapter;

/* Пусть у нас есть радио и мы хотим послушать музыку, но радио подключается только к европейской розетке. */
public class Radio {

    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}
