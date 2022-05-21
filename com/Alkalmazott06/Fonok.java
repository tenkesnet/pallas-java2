package com.Alkalmazott06;
public class Fonok extends Alkalmazott {
    final int MAXBEOSZT = 20;
    Alkalmazott[] beosztottak = new Alkalmazott[MAXBEOSZT];
    int beosztottakSzama = 0;

    public Fonok(String nev, int fizetes) {
        super(nev, fizetes);
    }
    public Fonok(String nev) {
        this(nev, 100000);
    }
    public void ujBeosztott(Alkalmazott b) {
        beosztottak[beosztottakSzama++] = b;
    }
    public int potlek() {
        return super.potlek() + beosztottakSzama*1000;
    }
}
