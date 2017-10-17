package net.petriv.patterns.adapter;

public class AdapterFileToOutputStream extends OutputStream implements File {
    @Override
    public void write() {
        writeInFile();
    }

    @Override
    public void read() {
        readFromFile();
    }
}
