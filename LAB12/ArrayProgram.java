//Write a Java program to store 10 integers in a 1-D array and display:all elements,sum of elements,largest and smallest number.
import java.util.Scanner;
public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
       
        int largest = arr[0];
        int smallest = arr[0];
       
        for (int i = 0; i < 10; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Array Elements are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nSum of elements = " + sum);
        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
        sc.close();
    }
}