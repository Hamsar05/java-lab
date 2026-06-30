public class Student2{

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();

        s1.name = "Ria";
        s1.age = 20;

        s2.name = "Alice";
        s2.age = 21;

        s3.name = "Neha";
        s3.age = 19;

        s1.display();
        s2.display();
        s3.display();
    }
}