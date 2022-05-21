public class Alkalmazott {
    String nev;
    int fizetes;

    void fizetestEmel(int novekmeny) {
        fizetes += novekmeny;
    }
    boolean tobbetKeresMint(Alkalmazott masik) {
        return fizetes > masik.fizetes;
    }
}
