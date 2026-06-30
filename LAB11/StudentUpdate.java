
//Write a Java program to create a Student class with marks. Pass the object to a method and update the marks, then display updated values.
class Student1{
    int marks;

    Student1(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class StudentUpdate {

    static void updateMarks(Student1 s) {
        s.marks = 95;
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1(70);

        System.out.println("Before Update:");
        s1.display();

        updateMarks(s1);

        System.out.println("After Update:");
        s1.display();
    }
}