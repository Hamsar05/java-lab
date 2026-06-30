// Returning Object from Method
// LAB 11 : 3. Write a Java program to create a Car class with model and price. Write a method that creates and returns a Car object.

class Car {
    String model;
    int price;

    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    static Car createCar() {
        return new Car("Tesla Model 3", 40000);
    }

    public static void main(String[] args) {
        Car myCar = createCar();
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Price    : $" + myCar.price);
    }
}