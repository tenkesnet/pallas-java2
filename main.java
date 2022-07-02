import java.text.SimpleDateFormat;

import com.pallas.controller.Library;
import com.pallas.repository.RepositoryBook;
import com.pallas.repository.RepositoryPerson;
import com.pallas.service.JsonBookService;
import com.pallas.service.JsonPersonService;
import com.pallas.service.ObjectBookService;
import com.pallas.service.ObjectPersonService;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        RepositoryPerson objectpersonrepo = new RepositoryPerson(new JsonPersonService());
        RepositoryBook objectbookrepo = new RepositoryBook(new JsonBookService());

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
