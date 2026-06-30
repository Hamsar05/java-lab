//Write a Java program to create a University class with a static nested class Department that stores department details and displays them.

class University {

    static class Department {
        String deptName;
        int facultyCount;

        Department(String deptName, int facultyCount) {
            this.deptName = deptName;
            this.facultyCount = facultyCount;
        }

        void display() {
            System.out.println("Department: " + deptName);
            System.out.println("Faculty Count: " + facultyCount);
        }
    }

    public static void main(String[] args) {
        Department d = new Department("Computer Science", 25);
        d.display();
    }
}