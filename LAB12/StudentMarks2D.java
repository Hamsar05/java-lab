//Program using a multi-dimensional array to store marks of students in 3 subjects and display total and average marks.
import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[][] = new int[3][3];

        System.out.println("Enter marks for 3 students in 3 subjects:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {

            int total = 0;

            for(int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;

            System.out.println("Student " + (i + 1));
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
        }
    }
}