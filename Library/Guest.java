package Library;

import java.util.List;

public class Guest extends Person {

    public Guest(String name, String ID, int age, String login, String password, String role) {
        super(name, ID, age, login, password, role);
    }

    public void viewCatalog(List<Book> catalog){
        for (Book book : catalog) {
            book.displayBookInfo();
        }
    }
    
}
