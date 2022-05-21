
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.text.AbstractDocument.BranchElement;

import com.Sikidom.Kor;
import com.Sikidom.Sikidom;
import com.Sikidom.Teglalap;

public class pelda1 {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] b = new String[3];
        String[] c = new String[3];
        b[0] = "banán";
        b[1] = "körte";
        //b[2] = "alma";

        ArrayList<String> nevek = new ArrayList<String>(Arrays.asList("Robi","Géza","István","Robi"));
        

        ArrayList<String> robik = new ArrayList<String>(Arrays.asList("Robi"));
        
        //nevek.removeAll(robik);
        
        for( String nev : nevek){
            System.out.println(nev);
        }

        /* ArrayList<Kor> korok = new ArrayList<Kor>();
        korok.add( new Kor(4));
        korok.add( new Kor(6));
        korok.add( new Kor(13));

        korok.remove(new Kor(13));

        System.out.println(new Kor(45).equals(new Kor(46)));
        for( Kor k : korok){
            System.out.println(k.r()+" sugarú körnek a területe("+k.hashCode()+"): "+ k.terulet());
        } */

    }
}