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
    Book book;  

    Library(Book book) {
        this.book = book;
    }

    void displayBook() {
        book.showTitle(); 
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Book b = new Book("Java Basics"); 
        Library libraryBook = new Library(b);     

        libraryBook.displayBook();
    }
}
