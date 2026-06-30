//Write a Java program to create a Hospital class with a static nested class Doctor that stores doctor details and specialization.

class Hospital {

    static class Doctor {
        String name;
        String specialization;

        Doctor(String name, String specialization) {
            this.name = name;
            this.specialization = specialization;
        }

        void display() {
            System.out.println("Doctor Name: " + name);
            System.out.println("Specialization: " + specialization);
        }
    }

    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Raj", "Cardiologist");
        d.display();
    }
}
