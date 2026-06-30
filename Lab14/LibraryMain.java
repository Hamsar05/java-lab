//Write a Java program to create an abstract class LibraryItem and implement issue and return operations for books and magazines.S

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract void issueItem();
    abstract void returnItem();
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    @Override
    void issueItem() {
        System.out.println("Book '" + title + "' is issued.");
    }

    @Override
    void returnItem() {
        System.out.println("Book '" + title + "' is returned.");
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    @Override
    void issueItem() {
        System.out.println("Magazine '" + title + "' is issued.");
    }

    @Override
    void returnItem() {
        System.out.println("Magazine '" + title + "' is returned.");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("Java Programming");
        LibraryItem item2 = new Magazine("Tech Today");

        item1.issueItem();
        item1.returnItem();
        
        item2.issueItem();
        item2.returnItem();
    }
}