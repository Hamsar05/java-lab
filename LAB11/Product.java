//Write a Java program to create a Product class with product name and price. Return the object from a method and print the details.
class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    } 

    static Product getProduct() {
        return new Product("Laptop", 75000.0);
    }

    public static void main(String[] args) {
        Product p = getProduct();
        System.out.println("Product: " + p.productName + " | Price: " + p.price);
    }
}