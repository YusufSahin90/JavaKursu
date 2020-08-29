package Gun27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTreeSet4 {
    public static void main(String[] args) {

        // HashSet, LinkedHashset,  TreeSet

        // Hash algoritmasına baglı sıralamaya göre sıklar
        HashSet<String> hs = new HashSet<>();

        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dört");
        hs.add("beş");

        System.out.println("hs : " + hs);


        // Eklenme sırasına göre
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dört");
        lhs.add("beş");

        System.out.println("lhs : " + lhs);


        // Alfabetik sıraya göre her eklemede saklar
        TreeSet<String> ts = new TreeSet<>();

        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dört");
        ts.add("beş");

        System.out.println("ts : " + ts);


        // Hash algoritmasına baglı sıralamaya göre sıklar
        HashSet<Integer> hs2 = new HashSet<>();

        hs2.add(5);
        hs2.add(89);
        hs2.add(3);
        hs2.add(17);
        hs2.add(1);

        System.out.println("hsSayi : " + hs2);


        // Eklenme sırasına göre saklar
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();

        lhs2.add(5);
        lhs2.add(89);
        lhs2.add(3);
        lhs2.add(17);
        lhs2.add(1);

        System.out.println("lhsSayi : " + lhs2);


        // Sayısal sıraya göre her eklemede saklar
        TreeSet<Integer> ts2 = new TreeSet<>();

        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);

        System.out.println("tsSayi : " + ts2);

    }
}
