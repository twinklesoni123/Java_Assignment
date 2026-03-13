// 2.Design a Book class (title, author, ISBN) and a Library class that manages a
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
// add a new book, remove a book by ISBN, and display all available books.
// import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a new book
    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Remove a book by ISBN
    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in library.");
        } else {
            System.out.println("Library Books:");
            for (Book b : books) {
                b.display();
            }
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Programming", "Guido van Rossum", "102");

        library.addBook(b1);
        library.addBook(b2);

        library.displayBooks();

        library.removeBook("101");

        library.displayBooks();
    }
}
