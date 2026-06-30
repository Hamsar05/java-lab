//Write a Java program to demonstrate method overriding using a class Bank with a method getInterestRate(), and subclasses SBI, HDFC, and ICICI overriding the method to return different interest rates.
 class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() { return 5.5; }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() { return 6.0; }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() { return 6.5; }
}

public class BankTest {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}
    