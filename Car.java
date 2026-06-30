 public class Car {

    String brand;
    int price;

    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.brand = "Toyota";
        c1.price = 1500000;

        c2.brand = "Hyundai";
        c2.price = 1200000;

        c3.brand = "Honda";
        c3.price = 1400000;

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
    }
}