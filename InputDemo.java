import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean b = sc.nextBoolean();

        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("\n--- Entered Values ---");
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + b);
        System.out.println("String: " + s);
        
        sc.close();
    }
}
