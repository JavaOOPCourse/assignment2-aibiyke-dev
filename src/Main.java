import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Title : "); String t = scanner.nextLine();
                    System.out.println("Author :"); String a = scanner.nextLine();
                    System.out.println("Year :"); int y = scanner.nextInt();
                    library.addBook(new Book(t, a, y));
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Title :"); String t1 = scanner.nextLine();
                    System.out.println("Author :"); String a1 = scanner.nextLine();
                    System.out.println("Year : "); int y1 = scanner.nextInt();
                    System.out.println("File size :"); double f = scanner.nextDouble();
                    EBook book = new EBook(t1, a1, y1, f);
                    library.addBook(book);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Title of book :"); String t2 = scanner.nextLine();
                    library.searchByTitle(t2);
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Title :"); String t3 = scanner.nextLine();
                    library.borrowBook(t3);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Title :"); String t4 = scanner.nextLine();
                    library.returnBook(t4);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
