
// LAB 11 : 2. Write a Java program to create a BankAccount class with account number and balance. Return the object from a method and display the details.
class BankAccount {
    String accNo;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to create and return a BankAccount object
    static BankAccount getAccountDetails() {
        return new BankAccount("SBI12345", 5000.75);
    }

    public static void main(String[] args) {
        BankAccount myAcc = getAccountDetails();
        
        System.out.println("Account No: " + myAcc.accNo);
        System.out.println("Balance   : " + myAcc.balance);
    }
}