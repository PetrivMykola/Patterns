package net.petriv.patterns.prototype;

public class Car implements Copyable {
    int speed;
    String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public Object copy() {
        Car copy = new Car(speed, color);
        return copy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
