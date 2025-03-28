// Part class
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void showTitle() {
        System.out.println("Book title: " + title);
    }
}

// Whole class (has-a Book)
class Library {
    Book book;  // Aggregation

    Library(Book book) {
        this.book = book;
    }

    void displayBook() {
        book.showTitle(); // Using Book's method
    }
}

// Main class
public class Aggregation {
    public static void main(String[] args) {
        Book b = new Book("Java Basics"); // Independent object
        Library libraryBook = new Library(b);     // Library HAS-A Book

        libraryBook.displayBook();
    }
}
