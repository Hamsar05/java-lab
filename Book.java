//write a java program to create a book class with title and author . pass the object to a method and print book 
public class Book {

    String title;
    int pages;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.title = "Java Basics";
        b1.pages = 300;

        b2.title = "Python Guide";
        b2.pages = 250;

        b3.title = "Data Structures";
        b3.pages = 400;

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}