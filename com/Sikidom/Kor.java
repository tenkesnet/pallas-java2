package com.Sikidom;

public class Kor extends Sikidom {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Kor(double r) {
        this.r = r;
    }

    public double r() {
        return r;
    }

    protected double keruletSzamit() {
        return 2 * Math.PI * r;
    }

    protected double teruletSzamit() {
        return r * r * Math.PI;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Kor)) {
            return false;
        }
        if (((Kor) obj).r == this.r) {
            return true;
        }
        return false;
    }

}
