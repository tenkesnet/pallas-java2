
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.sound.midi.Soundbank;
import javax.swing.text.AbstractDocument.BranchElement;

import com.Sikidom.Kor;
import com.Sikidom.Sikidom;
import com.Sikidom.Teglalap;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pelda1 {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] b = new String[3];
        String[] c = new String[3];

        try {
            b[0] = "banán";
            b[1] = "körte";
            b[4] = "füge";
        } catch (Exception e) {
            System.err.println("A tömb túl lett címezve " + e.toString() + "\n\n");
        } finally {
            for (String item : b) {
                // System.out.println(item);
            }
        }

        // b[2] = "alma";

        ArrayList<String> nevek = new ArrayList<String>(Arrays.asList("Őrs", "Robi", "Géza", "István", "Robi"));

        ArrayList<String> robik = new ArrayList<String>(Arrays.asList("Robi"));

        // nevek.removeAll(robik);

        nevek.sort(String::compareToIgnoreCase);

        for (String teve : nevek) {
            System.out.println(teve);
        }
        // .......xx.........yy.......zz..........qq..................bb.....................

        ArrayList<Kor> korok = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jstring = Files.readString(Path.of("korok.json"));
            korok = objectMapper.readValue(jstring,
                    new TypeReference<ArrayList<Kor>>() {
                    });

        } catch (IOException e) {
            // TODO: handle exception
        }
        System.out.println(korok);
        // korok.add(new Kor(4));
        // korok.add(new Kor(4));
        // korok.add(new Kor(6));
        // korok.add(new Kor(13));

        RandomAccessFile file;
        // ObjectMapper objectMapper = new ObjectMapper();
        // objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        // try {
        // objectMapper.writeValue(new File("korok.json"), korok);
        // } catch (StreamWriteException e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // } catch (DatabindException e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // } catch (IOException e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // }

        System.exit(1);
        // try {
        // file = new RandomAccessFile("korok.json", "rw");
        // file.writeChars(gson.toJson(korok));
        // file.close();
        // } catch (FileNotFoundException e) {
        // System.out.println(e);
        // } catch (IOException e) {
        // System.out.println(e);
        // }
        // System.exit(1);

        for (String str : nevek) {
            System.out.println(str);
        }

        try {

            // System.out.println(new Kor(13).equals("13-askor"));
            ArrayList<Kor> r = new ArrayList<Kor>();
            r.add(new Kor(4));
            r.add(new Kor(6));

            korok.removeAll(r);

            // System.out.println(new Kor(45).equals(new Kor(46)));
            for (Kor k : korok) {
                System.out.println(k.r() + " sugarú körnek a területe(" + k.hashCode() + "): " + k.terulet());
            }
            System.out.println("\n\n");
        } catch (ClassCastException ec) {
            System.err.println("Az összehasonlítás nem lehetséges");
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                System.err.println("Konverziós hiba");
            } else {
                System.err.println(e.getMessage());
            }
        } finally {
            /*
             * korok.remove(new Kor(13));
             * for (Kor k : korok) {
             * System.out.println(k.r() + " sugarú körnek a területe(" + k.hashCode() +
             * "): " + k.terulet());
             * }
             */
        }

        System.out.println("Program normálisan befejeződött");

    }
}