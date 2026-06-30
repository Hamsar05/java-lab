//Object Passing as Parameter
// LAB 11 : 2. Write a Java program to create an Employee class with empId, name, and salary. Pass the object to a method that displays employee information.


class EmployeeDetails {
    int empId;
    String name;
    double salary;

    // Constructor
    EmployeeDetails(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    // Method that accepts an object as a parameter
    static void displayInfo(EmployeeDetails e) {
        System.out.println("Employee ID: " + e.empId);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }

    public static void main(String[] args) {
        // Create object
        EmployeeDetails empObj = new EmployeeDetails(101, "John Smith", 55000.0);
        
        // Pass object to method
        displayInfo(empObj);
    }
}