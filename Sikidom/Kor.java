public class Kor extends Sikidom {
    private double r;

    public Kor (double r) {
        this.r = r;
    }
    public double r () {
        return r;
    }
    protected double keruletSzamit() {
        return 2*Math.PI*r;
    }
    protected double teruletSzamit() {
        return r*r*Math.PI;
    }
}