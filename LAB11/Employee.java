//LAB 11 : 3. Write a Java program to demonstrate runtime polymorphism using a class Employee with a method work(), and subclasses Manager and Developer overriding the work() method.
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    // Since your file is Employee.java, we put the main method here!
    public static void main(String[] args) {
        // Creating a Manager object but using an Employee reference
        Employee emp1 = new Manager();
        
        // Creating a Developer object but using an Employee reference
        Employee emp2 = new Developer();
        
        System.out.println("--- Workplace Activity ---");
        emp1.work(); // Calls Manager's version
        emp2.work(); // Calls Developer's version
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team and planning projects.");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing and debugging code.");
    }
}