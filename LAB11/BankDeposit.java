//Write a Java program to create a BankAccount class with balance. Update the balance after deposit using object passing.
class BankData {
    double balance;

    BankData(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class BankDeposit {

    static void deposit(BankData b, double amount) {
        b.balance = b.balance + amount;
    }

    public static void main(String[] args) {

        BankData b1 = new BankData(10000);

        System.out.println("Before Deposit:");
        b1.display();

        deposit(b1, 5000);

        System.out.println("After Deposit:");
        b1.display();
    }
}