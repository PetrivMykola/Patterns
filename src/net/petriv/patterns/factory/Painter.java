package net.petriv.patterns.factory;

public class Painter implements Worker {
    @Override
    public void doSomeJob() {
        System.out.println("Painter paint walls ");
    }
}
