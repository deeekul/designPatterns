package ru.kulinchenko.structural.proxy.case_of_lazy_init;

class ProxyImage implements Image {

    private RealImage realImage;

    private String filename;

    ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}