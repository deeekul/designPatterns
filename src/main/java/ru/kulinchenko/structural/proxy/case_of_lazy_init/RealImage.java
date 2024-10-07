package ru.kulinchenko.structural.proxy.case_of_lazy_init;

public class RealImage implements Image {

    private String filename;

    RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk");
    }
}
