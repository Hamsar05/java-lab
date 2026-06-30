//Write a Java program to create a Computer class with a static nested class Specification to display hardware configuration details.

class Computer {

    static class Specification {
        String processor;
        int ram;

        Specification(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        void display() {
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ram + " GB");
        }
    }

    public static void main(String[] args) {
        Specification s = new Specification("Intel i7", 16);
        s.display();
    }
}