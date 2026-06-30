//Write a Java program to create an Employee class and use constructor chaining with this() to initialize employee ID, name, and salary.S

class Employee {
    int empId;
    String name;
    double salary;

    Employee() {
        this(101);
        System.out.println("Default Constructor");
    }

    Employee(int empId) {
        this(empId, "Hamsa");
    }

    Employee(int empId, String name) {
        this(empId, name, 50000);
    }

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}