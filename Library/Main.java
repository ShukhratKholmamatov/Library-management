package Library;
public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Library", "123 Library St");

        Librarian librarian = new Librarian("Emily Johnson", "L001", 35, "emilyj", "libpass");
        Member member1 = new Member("John Doe", "M001", 25, "johndoe", "password123");
        Member member2 = new Member("Jane Smith", "M002", 30, "janesmith", "password456");

        library.addLibrarian(librarian);
        library.registerMember(member1);
        library.registerMember(member2);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "1984", "George Orwell");

        librarian.addBook(book1);
        librarian.addBook(book2);

        librarian.issueBook(book1, member1);
        librarian.issueBook(book2, member2);

        librarian.returnBook(book1, member1);

        member1.displayInfo();
        member2.displayInfo();
        librarian.displayInfo();

        for (Book book : library.getCatalog()) {
            book.displayBookInfo();
        }
    }
}
