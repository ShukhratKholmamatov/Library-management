package Library;
import java.util.ArrayList;

public class Librarian extends Person {
    private ArrayList<Book> managedBooks;

    public Librarian(String name, String ID, int age, String login, String password) {
        super(name, ID, age, login, password, "LIBRARIAN");
        this.managedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        managedBooks.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (book.isAvailable()) {
            managedBooks.remove(book);
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Cannot remove, book is currently borrowed.");
        }
    }

    public void issueBook(Book book, Member member) {
        if (book.isAvailable()) {
            member.borrowBook(book);
            System.out.println("Book issued to: " + member.name);
        } else {
            System.out.println("Book is not available for issuing.");
        }
    }

    public void returnBook(Book book, Member member) {
        member.returnBook(book);
        System.out.println("Book returned by: " + member.name);
    }

    public void viewManagedBooks() {
        System.out.println("Managed Books:");
        for (Book book : managedBooks) {
            book.displayBookInfo();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Managed Books: " + managedBooks.size());
    }
}
