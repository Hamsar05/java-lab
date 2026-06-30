//Write a Java program to create a Student class and return a Student object from a method with initialized values.
class StudentData {
    int id;
    String name;

    StudentData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class StudentReturn {

    static StudentData createStudent() {
        StudentData s = new StudentData(101, "Hamsa");
        return s;
    }

    public static void main(String[] args) {

        StudentData s1 = createStudent();

        s1.display();
    }
}