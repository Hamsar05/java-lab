//Program using String class to count vowels, count consonants and reverse the given string.
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Reversed String = " + reverse);
    }
}