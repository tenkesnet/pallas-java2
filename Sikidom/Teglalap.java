public class Teglalap extends Sikidom {
    private double a, b;

    public Teglalap (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double a () {
        return a;
    }
    public double b () {
        return b;
    }
    protected double keruletSzamit () {
        return 2*(a+b);
    }
    protected double teruletSzamit () {
        return a*b;
    }
}
