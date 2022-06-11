import com.pallas.controller.Library;
import com.pallas.repository.RepositoryPersonObject;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        RepositoryPersonObject objectrepo = new RepositoryPersonObject();
        Library lib = new Library(objectrepo);
        lib.printBooks();
        System.out.println("");
        lib.printRentals();
        System.out.println("");
        lib.booksToFile();
        System.out.println("");
        System.out.println(lib.personsToJSON());
    }
}
