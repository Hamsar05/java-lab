//Write a Java program to create a Store class with a static nested class Product that stores and displays product information

class Store {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println("Product Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 55000);
        p.display();
    }
}