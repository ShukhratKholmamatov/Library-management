package Library;
import java.util.ArrayList;

public class Library {
    private String name;
    private String location;
    private ArrayList<Book> catalog;
    private ArrayList<Member> members;
    private ArrayList<Librarian> librarians;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.catalog = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.name);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
        System.out.println("Librarian added: " + librarian.name);
    }

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book added to catalog: " + book.getTitle());
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Librarian> getLibrarians() {
        return librarians;
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
