public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        isAvailable = false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", year: " + year + ", is available: " + isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Book other = (Book) obj;
        return title.equalsIgnoreCase(other.title) && author.equalsIgnoreCase(other.author) && year == other.year;
    }
}
