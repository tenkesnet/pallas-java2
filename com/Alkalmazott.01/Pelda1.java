public class Pelda1 {
    public static void main(String[] args) {
        Alkalmazott a;

        a = new Alkalmazott();

        a.nev = "Kovács János";
        a.fizetes = 50000;
        a.fizetestEmel(6300);
        System.out.println(a.nev);
    }
}
