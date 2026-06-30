// Program 1: Multiplication of two numbers
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Multiplication: " + product);

        sc.close();
    }
}
