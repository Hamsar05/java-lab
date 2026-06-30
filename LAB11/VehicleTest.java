// LAB 11 - 1. Write a Java program to demonstrate method overriding using a class Vehicle with a method start(), and subclasses Car and Bike overriding the start() method.
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button: Vroom!");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start: Brrrr!");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}