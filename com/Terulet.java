package com;

public class Terulet  {
    protected double a;
    protected double b;
    public double t;

    public Terulet(int aoldal, int boldal) {
        a=aoldal;
        b=boldal;
        t=a*b;
    }

    public Terulet() {
        super();
    }
    
    public void szamitas(){
        t=a*b;
    }
}
