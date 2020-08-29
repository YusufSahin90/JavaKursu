package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");   //  bundan oldugu için tekrardan eklemedi.
        hs.add("red");
        hs.add("rED");

        // 1. Yol
        System.out.println("********** 1. yol **********");
        System.out.println("hs : " + hs);

        // 2. Yol
        System.out.println("********** 2. yol **********");
        for(String s : hs){

            System.out.println("s : " + s);
        }

        // 3. Yol

        System.out.println("********** 3. Yol **********");
        Iterator gosterge = hs.iterator();

        while(gosterge.hasNext()){   // sonraki varsa

            System.out.println("Sonraki eleman : " + gosterge.next());
        }
        System.out.println();


        hs.remove("Red");  // bir eleman siler.

        System.out.println("remove sonrası hs : " + hs);
        hs.clear();           // set i temizler.

        System.out.println();

        System.out.println("clear sonrası hs : " + hs);

    }
}
