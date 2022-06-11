import com.pallas.controller.Library;
import com.pallas.repository.RepositoryPerson;

import com.pallas.service.ObjectPersonService;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        RepositoryPerson objectrepo = new RepositoryPerson(new ObjectPersonService());
        Library lib = new Library(objectrepo);
        lib.printBooks();
        System.out.println("");
        lib.printRentals();
        System.out.println("");
        lib.booksToFile();
        System.out.println("");
        // System.out.println(lib.personsToJSON());
    }
}
