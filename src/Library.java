import java.sql.SQLOutput;

public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        // implement
        if(count < books.length) {
            books[count++] = book;
        } else{
            System.out.println("No space available!");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        // implement
        for(int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(int i = 0; i < count; i++) {
            if(books[i].getTitle() == title) {
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        // implement
        for( int y = 0; y < count; y++) {
            if(books[y].getTitle().equalsIgnoreCase(title) && books[y].isAvailable()) {
                books[y].borrowBook();
                System.out.println("You successfully borrowed: " + books[y].getTitle());
            }
            else{
                System.out.println("Unfortunately book is not available(");
            }
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        Book x = searchByTitle(title);
        if(x != null) {
            x.returnBook();
            System.out.println("Congrats! You returned book: " + x.getTitle());
        }
        else {
            System.out.println("Oops.. book is not found to be ours");
        }
    }
}
