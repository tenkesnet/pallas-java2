import java.text.SimpleDateFormat;

import com.pallas.controller.Library;
import com.pallas.repository.RepositoryBook;
import com.pallas.repository.RepositoryPerson;
import com.pallas.service.JsonBookService;
import com.pallas.service.JsonPersonService;
import com.pallas.service.ObjectBookService;
import com.pallas.service.ObjectPersonService;
import com.pallas.service.SQLBookService;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/pallas",
                            "pallas", "Oktato123");
            c.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        RepositoryPerson objectpersonrepo = new RepositoryPerson(new JsonPersonService());
        RepositoryBook objectbookrepo = new RepositoryBook(new SQLBookService(c));

        Library lib = new Library(objectpersonrepo, objectbookrepo);
        lib.changeAddress(3, "Szeged", "7623", "Stadion u. 10");
        lib.printBooks();
        System.out.println("");
        lib.printRentals();
        System.out.println("");
        System.out.println("A keresett (856867867856) könyv szerzzője: " + lib.getBook("856867867856").getAuthor());
        System.out.println("");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("A keresett (Kiss Evelin) Születési ideje: " +
                format.format(lib.getPerson("Kiss Evelin", "Szűcs Irén").getBirthday()));
        // System.out.println(lib.personsToJSON());
    }
}
