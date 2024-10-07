package ru.kulinchenko.structural.decorator;

public class Start {

    /* Static конечно неправильно, вообще это делает в нестатическом методе, но опустим момент */
    private static Component window;

    private static Component textView;

    private static Component button;

    public static void main(String[] args) {
        /* Выбираем, нужна ли нам отрисовка границ или нет */
        boolean showBorder = true;
        if (showBorder) {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());

        } else {
            window = new Window();
            textView = new TextView();
            button = new Button();
        }

        window.draw();
        textView.draw();
    }
}
