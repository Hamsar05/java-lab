//Program using StringBuilder to append strings, insert a word at a specific position and reverse the final string.
public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello ");
        sb.append("World");

        System.out.println("After Append: " + sb);

        sb.insert(6, "Java ");

        System.out.println("After Insert: " + sb);

        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}