// 19. A library wants to store details of multiple books.
// Question:
// Create a class Book with attributes:
//  title
//  author
//  price
// Create an array of Book objects and display the details of all books.
class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class Library {
    public static void main(String[] args) {

        // Array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("The Alchemist", "Paulo Coelho", 350.0);
        books[1] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 500.0);
        books[2] = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 300.0);

        // Display all books
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
