package ru.kulinchenko.adapter;

/* В этом примере нужно "превратить" американскую розетку в европейскую, чтобы мы могли слушать радио */
public class AdapterLesson {

    public static void main(String[] args) {
        AmericanSocket simpleAmericanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio();

        EuroSocket euroSocket = new SocketAdapter(simpleAmericanSocket);
        radio.listenMusic(euroSocket);
    }
}
