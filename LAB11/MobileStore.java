//Write a Java program to create a Mobile class with price. Pass the object to a method and apply discount by updating the price.
class Mobile {
    String model;
    double price;

    Mobile(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

public class MobileStore {
    // Method to apply a fixed discount
    public static void applyDiscount(Mobile mob, double discountPercentage) {
        double discountAmount = mob.price * (discountPercentage / 100);
        mob.price -= discountAmount;
    }

    public static void main(String[] args) {
        Mobile phone = new Mobile("iPhone 15", 999.0);
        System.out.println("Original Price: $" + phone.price);

        applyDiscount(phone, 15); // Applying 15% discount

        System.out.println("Price after 15% discount: $" + phone.price);
    }
}