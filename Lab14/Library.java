//Write a Java program to create a Library class with a static nested class Book that stores and displays book information.

class Library {

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling");
        b.display();
    }
}