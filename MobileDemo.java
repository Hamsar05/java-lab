class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    Mobile(String b, String m) {
        brand = b;
        model = m;
        price = 10000;
    }

    void displayMobile() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", "iPhone 15", 80000);
        Mobile m2 = new Mobile("Samsung", "Galaxy S23");

        m1.displayMobile();
        m2.displayMobile();
    }
}