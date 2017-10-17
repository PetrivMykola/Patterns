package net.petriv.patterns.proxy;

public class ImageApp {
    public static void main(String[] args) {
        Image image = new ProxyImage("C:/tmp/file.txt");
        image.display();
    }
}
