//#question 5 
class Bank {
    final double INTEREST_RATE = 0.05;
    static double totalBankBalance = 0;

    double accountBalance;

    Bank(double balance) {
        accountBalance = balance;
        totalBankBalance += balance;
    }

    void deposit(double amount) {
        accountBalance += amount;
        totalBankBalance += amount;
    }

    void display() {
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Interest Rate: " + INTEREST_RATE);
    }

    static void showTotalBalance() {
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank(5000);
        Bank b2 = new Bank(3000);

        b1.deposit(1000);
        b2.deposit(2000);

        b1.display();
        b2.display();

        Bank.showTotalBalance();
    }
}