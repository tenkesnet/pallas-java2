public class Tulterheles {
    void m(Alkalmazott a1, Alkalmazott a2) {
        // ...
    }
    void m(Alkalmazott a, Fonok f) {
        // ...
    }
    void m(Fonok f, Alkalmazott a) {
        // ...
    }
    void proba () {
        Alkalmazott a = new Alkalmazott("Pista");
        Alkalmazott af = new Fonok("Jóska");
        Fonok f = new Fonok("Géza");

        m(a,a);               // m(Alkalmazott,Alkalmazott)
        m(a,af);              // m(Alkalmazott,Alkalmazott)
        m(a,f);               // m(Alkalmazott,Fonok)
        m(f,f);               // fordítási hiba
        m(f,(Alkalmazott)f);  // m(Fonok,Alkalmazott)   
    }
}
