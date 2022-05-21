package com.Sikidom;

public abstract class Sikidom {
    private boolean keruletKiszamitva = false;
    private boolean teruletKiszamitva = false;
    private double kerulet;
    private double terulet;

    public double kerulet() {
        if (!keruletKiszamitva) {
            kerulet = keruletSzamit();
            keruletKiszamitva = true;
        }
        return kerulet;
    }
    public double terulet() {
        if ( ! teruletKiszamitva) {
            terulet = teruletSzamit();
            teruletKiszamitva = true;
        }
        return terulet;
    }
    protected abstract double keruletSzamit();
    protected abstract double teruletSzamit();
}

