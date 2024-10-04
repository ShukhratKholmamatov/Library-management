package Library;
import java.util.ArrayList;

public class Member extends Person {
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String ID, int age, String login, String password) {
        super(name, ID, age, login, password, "MEMBER");
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("The book is unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }

    public void viewBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Borrowed Books: " + borrowedBooks.size());
    }
}
