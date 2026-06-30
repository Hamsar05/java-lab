//Write a Java program to create a Library class where a Book object is passed, modified, and returned from another method.
class BookData {
    String title;

    BookData(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Book Title: " + title);
    }
}

public class LibraryBook {

    static BookData modifyBook(BookData b) {
        b.title = "Java Programming";
        return b;
    }

    public static void main(String[] args) {

        BookData b1 = new BookData("Python Basics");

        System.out.println("Before Modification:");
        b1.display();

        b1 = modifyBook(b1);

        System.out.println("After Modification:");
        b1.display();
    }
}
