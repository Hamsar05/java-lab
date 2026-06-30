//Program to accept marks of 5 students and calculate average marks, highest marks and number of students scoring above average.
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0, highest;

        System.out.println("Enter marks of 5 students:");

        for(int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = sum / 5.0;

        highest = marks[0];

        for(int i = 0; i < 5; i++) {
            if(marks[i] > highest)
                highest = marks[i];
        }

        int count = 0;

        for(int i = 0; i < 5; i++) {
            if(marks[i] > average)
                count++;
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Students Above Average = " + count);
    }
}
