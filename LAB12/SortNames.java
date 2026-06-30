//Program using ArrayList<String> to store names of students and sort them alphabetically
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter 5 student names:");

        for(int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }

        Collections.sort(names);

        System.out.println("Sorted Names:");

        for(String name : names) {
            System.out.println(name);
        }
    }
}