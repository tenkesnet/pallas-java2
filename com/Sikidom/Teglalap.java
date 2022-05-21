package com.Sikidom;

public class Teglalap extends Sikidom {
    private double a, b;

    public Teglalap (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA () {
        return a;
    }
    public double getB () {
        return b;
    }
    protected double keruletSzamit () {
        return 2*(a+b);
    }
    protected double teruletSzamit () {
        return a*b;
    }
    
    @Override
    public boolean equals(Object obj) {
        if( ((Teglalap)obj).a == this.a && ((Teglalap)obj).b== this.b   ) {
            return true;
        }
        return false;
    }
}
