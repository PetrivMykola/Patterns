package net.petriv.patterns.prototype;

public class CarCopyRunner {
    public static void main(String[] args) {

        Car car1 = new Car(2000, "red");
        System.out.println(car1);

        Car copy = (Car) car1.copy();
        System.out.println(copy);

        CarFactory carFactory = new CarFactory(copy);
        Car car2 = carFactory.makeCopy();
        System.out.println(car2);

    }
}
