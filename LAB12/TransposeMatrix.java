//Program to store and display the transpose of a matrix using a 2-D array.
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];

        System.out.println("Enter matrix:");

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix:");

        for(int i = 0; i < 2; i++) {

            for(int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }

            System.out.println();
        }
    }
}