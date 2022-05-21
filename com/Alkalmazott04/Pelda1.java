package com.Alkalmazott04;
public class Pelda1 {
    public static void main(String[] args) {
        Alkalmazott a = new Alkalmazott();

        a.nyugdijKorhatar = 65;             // ez ugyanazt jelenti,
        Alkalmazott.nyugdijKorhatar = 65;   // mint ez
    }
}
