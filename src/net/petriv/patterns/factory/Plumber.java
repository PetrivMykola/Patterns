package net.petriv.patterns.factory;

public class Plumber implements Worker {
    @Override
    public void doSomeJob() {
        System.out.println("Plumber connect pipes...");
    }
}
