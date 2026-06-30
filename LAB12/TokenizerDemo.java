//Program using StringTokenizer to read a sentence and display total number of words, each word on a new line and length of each word.
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        int count = st.countTokens();

        System.out.println("Total Words = " + count);

        while(st.hasMoreTokens()) {

            String word = st.nextToken();

            System.out.println(word);
            System.out.println("Length = " + word.length());
        }
    }
}