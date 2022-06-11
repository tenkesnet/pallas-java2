import com.pallas.controller.Library;
import com.pallas.repository.RepositoryBook;
import com.pallas.repository.RepositoryPerson;
import com.pallas.service.ObjectBookService;
import com.pallas.service.ObjectPersonService;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        RepositoryPerson objectpersonrepo = new RepositoryPerson(new ObjectPersonService());
        RepositoryBook objectbookrepo = new RepositoryBook(new ObjectBookService());
        Library lib = new Library(objectpersonrepo, objectbookrepo);
        lib.printBooks();
        System.out.println("");
        lib.printRentals();
        System.out.println("");
        lib.booksToFile();
        System.out.println("");
        // System.out.println(lib.personsToJSON());
    }
}
