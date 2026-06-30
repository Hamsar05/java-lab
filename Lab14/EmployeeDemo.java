// Question 3: Write a Java program to store different types of employees in an array of superclass references and invoke their overridden methods at runtime.

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Tester tests the software");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp[] = new Employee[3];

        emp[0] = new Manager();
        emp[1] = new Developer();
        emp[2] = new Tester();

        for (Employee e : emp) {
            e.work();
        }
    }
}