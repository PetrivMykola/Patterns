package net.petriv.patterns.proxy;

public class ProxyImage implements Image {
    public String file;
    public RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage("C:/tmp/file.txt");
        }
        realImage.display();
    }
}
