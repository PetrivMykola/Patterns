package net.petriv.patterns.adapter;

public class RunnerAdapter {
    public static void main(String[] args) {
        File file = new AdapterFileToOutputStream();

        file.read();
        file.write();
    }
}
