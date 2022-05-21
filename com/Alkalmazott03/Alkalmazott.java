package com.Alkalmazott03;
public class Alkalmazott {
    String nev;
    int fizetes;
    int evesFizetes;

    void ujFizetes(int osszeg) {
        fizetes = osszeg;
        evesFizetes = 12*osszeg;
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
}
