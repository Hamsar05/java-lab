//Object Passing as Parameter
// LAB 11 : 1. Write a Java program to create a Student class with id and name. Pass a Student object to a method and display its details.
class Student {
    int id;
    String name;

    // Constructor to initialize student data
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // This method accepts a 'Student' object as a parameter
    static void displayStudentDetails(Student s) {
        System.out.println("----- Student Record -----");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }

    public static void main(String[] args) {
        // Create the object
        Student st1 = new Student(101, "Aryan");

        // Pass the object to the method
        displayStudentDetails(st1);
    }
}