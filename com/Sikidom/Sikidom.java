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
        if (!teruletKiszamitva) {
            terulet = teruletSzamit();
            teruletKiszamitva = true;
        }
        return terulet;
    }

    protected abstract double keruletSzamit();

    protected abstract double teruletSzamit();

    public boolean isKeruletKiszamitva() {
        return keruletKiszamitva;
    }

    public void setKeruletKiszamitva(boolean keruletKiszamitva) {
        this.keruletKiszamitva = keruletKiszamitva;
    }

    public boolean isTeruletKiszamitva() {
        return teruletKiszamitva;
    }

    public void setTeruletKiszamitva(boolean teruletKiszamitva) {
        this.teruletKiszamitva = teruletKiszamitva;
    }

    public double getKerulet() {
        return kerulet;
    }

    public void setKerulet(double kerulet) {
        this.kerulet = kerulet;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }
}
