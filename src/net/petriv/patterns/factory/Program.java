package net.petriv.patterns.factory;

public class Program {
    public static void main(String[] args) {
        WorkerFactory workerFactory = createWorkerBy("plumber");
        Worker worker = workerFactory.createWorker();
        worker.doSomeJob();
    }

    static WorkerFactory createWorkerBy(String special) {
        if (special.equalsIgnoreCase("plumber")) {
            return new PlumberFactory();
        } else if (special.equalsIgnoreCase("painter")) {
            return new PainterFactory();
        } else {
            throw new RuntimeException();
        }
    }
}
