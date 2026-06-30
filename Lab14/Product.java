//Write a Java program to create a Product class that uses constructor chaining to initialize product information and calculate the total cost of purchased items.

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product() {
        this(1);
    }

    Product(int productId) {
        this(productId, "Laptop");
    }

    Product(int productId, String productName) {
        this(productId, productName, 50000);
    }

    Product(int productId, String productName, double price) {
        this(productId, productName, price, 2);
    }

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void calculateTotalCost() {
        double total = price * quantity;
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.calculateTotalCost();
    }
}