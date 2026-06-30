//Write a Java program to create an abstract class Payment and implement payment processing for UPI, Credit Card, and Net Banking transactions.

abstract class Payment {
    abstract void processPayment(double amount);
}

class UPI extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount + " Successful");
    }
}

class CreditCard extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Credit Card Payment of Rs." + amount + " Successful");
    }
}

class NetBanking extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Net Banking Payment of Rs." + amount + " Failed ");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();

        p1.processPayment(1000);
        p2.processPayment(2000);
        p3.processPayment(3000);
    }
}