package ru.kulinchenko.structural.proxy.case_of_lazy_init;

/* В этом примере паттерн Proxy используется для создания ProxyImage, который создает RealImage только в тот момент,
   когда требуется отобразить изображение. */
public class LazyInitializationExample {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        /* С загрузкой происходит только при вызове метода display */
        image.display();

        /* Загрузка не происходит, так как объект уже создан ранее */
        image.display();
    }
}


