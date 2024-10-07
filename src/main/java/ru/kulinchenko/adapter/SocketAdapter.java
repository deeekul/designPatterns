package ru.kulinchenko.adapter;

/* Адаптер, который совмещает ЕвроСокет с американским сокетом */
public class SocketAdapter implements EuroSocket {

    private AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}
