package com.Alkalmazott05;
public class Alkalmazott {
    String nev;
    private int fizetes;
    private int evesFizetes;
    static int nyugdijKorhatar = 60;   // �ltal�nos nyugd�jkorhat�r
    int eletkor;                       // �letkor szem�lyenk�nt

    public Alkalmazott(String nev, int fizetes) {
        this.nev = nev;
        this.fizetes = fizetes;
        this.evesFizetes = 12*fizetes;
    }
    public Alkalmazott(String nev) {
        this.nev = nev;
        this.fizetes = 40000;
        this.evesFizetes = 12*fizetes;
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
    int hatraVan() {                   // ennyi �vet kell meg dolgozni
        return nyugdijKorhatar - eletkor;
    }
    static void nyugdijKorhatartEmel() {
        nyugdijKorhatar++;
    }
}
