package net.petriv.patterns.factory;

public class PainterFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Painter();
    }
}
