//Write a Java program to create an Employee class with salary. Pass the object to a method and increase the salary by 10%.
class EmployeeData {
    double salary;

    EmployeeData(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeUpdate {

    static void increaseSalary(EmployeeData e) {
        e.salary = e.salary + (e.salary * 0.10);
    }

    public static void main(String[] args) {

        EmployeeData e1 = new EmployeeData(50000);

        System.out.println("Before Increment:");
        e1.display();

        increaseSalary(e1);

        System.out.println("After Increment:");
        e1.display();
    }
}