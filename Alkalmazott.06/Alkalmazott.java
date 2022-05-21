public class Alkalmazott {
    String nev;
    private int fizetes;
    private int evesFizetes;
    static int nyugdijKorhatar = 60;   // általános nyugdíjkorhatár
    int eletkor;                       // életkor személyenként
    int nyelvekSzama;

    static int[] evesSzabadsag = new int [60];

    static {
        for (int i = 0; i < 30; i++)
            evesSzabadsag[i] = 15;
        for (int i = 30; i < 40; i++)
            evesSzabadsag[i] = evesSzabadsag[i-1] + 1;
        for (int i = 40; i < 50; i++)
            evesSzabadsag[i] = evesSzabadsag[i-1] + 2;
        for (int i = 50; i < 60; i++)
            evesSzabadsag[i] = evesSzabadsag[i-1] + 1;
    }

    public Alkalmazott(String nev, int fizetes) {
        this.nev = nev;
        this.fizetes = fizetes;
        this.evesFizetes = 12*fizetes;
    }
    public Alkalmazott(String nev) {
        this(nev,40000);
    }
    void ujFizetes(int osszeg) {
        fizetes = osszeg;
        evesFizetes = 12*osszeg;
    }
    public int fizetes() {
       return fizetes;
    }
    public int evesFizetes() {
       return evesFizetes;
    }
    void fizetestEmel(int novekmeny) {
        fizetes += novekmeny;
    }
    void fizetestEmel() {
        fizetes += 5000;
    }
    void fizetestEmel(Alkalmazott masik) {
        if (kevesebbetKeresMint(masik))
            fizetes = masik.fizetes;
    }
    boolean tobbetKeresMint(Alkalmazott masik) {
        return fizetes > masik.fizetes;
    }
    boolean kozepesJovedelmu(int minimum, int maximum) {
        return minimum <= fizetes && fizetes <= maximum;
    }
    void fizetestDuplaz() {
        fizetes *= 2;
    }
    void automatikusFizetesEmeles() {
        if (kozepesJovedelmu(30000, 60000))
            fizetestEmel(5000);
    }
    int szja() {
        return fizetes*2/5;
    }
    int tb() {
        return fizetes/10;
    }
    boolean kevesebbetKeresMint(Alkalmazott masik) {
        return masik.tobbetKeresMint(this);
    }
    int hatraVan() {                   // ennyi évet kell meg dolgozni
        return nyugdijKorhatar - eletkor;
    }
    static void nyugdijKorhatartEmel() {
        nyugdijKorhatar++;
    }
    public int evesSzabadsag() {
        if (eletkor < 60)
            return evesSzabadsag[eletkor];
        else
            return evesSzabadsag[59];
    }
    public int potlek() {
        return nyelvekSzama*5000;
    }
    public int fizetesPotlekokkal() {
        return fizetes() + potlek();
    }
}
