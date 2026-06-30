
//Object Passing as Parameter
//LAB 11 : 3. Write a Java program to create a Book class with title and author. Pass the object to a method and print book details.

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    static void printBookDetails(Book b) {
        System.out.println("----- Library Log -----");
        System.out.println("Title  : " + b.title);
        System.out.println("Author : " + b.author);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "Herbert Schildt");
        
        // Passing the object 'myBook'
        printBookDetails(myBook);
    }
}