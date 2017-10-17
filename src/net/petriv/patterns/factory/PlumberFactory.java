package net.petriv.patterns.factory;

public class PlumberFactory  implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Plumber();
    }
}
