//Write a Java program where a Person object is passed to a method, updated inside the method, and then returned back.
class PersonData {
    String name;

    PersonData(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class PersonUpdate {

    static PersonData updatePerson(PersonData p) {
        p.name = "Rahul";
        return p;
    }

    public static void main(String[] args) {

        PersonData p1 = new PersonData("Hamsa");

        System.out.println("Before Update:");
        p1.display();

        p1 = updatePerson(p1);

        System.out.println("After Update:");
        p1.display();
    }
}