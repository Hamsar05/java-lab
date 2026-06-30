// Question 2: Write a Java program to demonstrate runtime polymorphism in a payment gateway system supporting multiple payment methods.

class Payment {
    void pay() {
        System.out.println("Payment is being processed");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class NetBanking extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

public class Question2 {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}