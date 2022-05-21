public class Pelda5 {
    final Alkalmazott A = new Alkalmazott();

    void proba() {
        A = new Alkalmazott();   // NEM LEHET!!!
        A.fizetes = 35000;       // lehet
    }
}
