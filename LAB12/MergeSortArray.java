//Program to merge two arrays into a single array and display the merged array in ascending order.
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];

        System.out.println("Enter first array:");

        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");

        for(int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            c[i] = a[i];
        }

        for(int i = 0; i < 3; i++) {
            c[i + 3] = b[i];
        }

        Arrays.sort(c);

        System.out.println("Merged Sorted Array:");

        for(int i = 0; i < 6; i++) {
            System.out.print(c[i] + " ");
        }
    }
}