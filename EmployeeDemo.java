class Employee {
    String name;
    double salary;
    static int totalEmployees = 0;

    Employee(String n, double s) {
        name = n;
        salary = s;
        totalEmployees++;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000);
        Employee e2 = new Employee("Bob", 60000);
        Employee e3 = new Employee("Charlie", 55000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayTotalEmployees();
    }
}