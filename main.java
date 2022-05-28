import com.pallas.controller.Library;

public class main {
    public static void main(String[] args) {
        System.out.println("Üdvözöllek a könyvtár nyilvántartó programban");
        System.out.println("---------------------------------------------");

        Library lib = new Library();
        lib.printBooks();
    }
}
