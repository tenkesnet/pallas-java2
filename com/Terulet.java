package com;

public class Terulet  {
    double a;
    double b;
    double t;

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
