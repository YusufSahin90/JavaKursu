package Gun28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {

        // Setlerde tekrarlayan eleman eklenemiyor, sen eklemeye çalışsan da o eklemeyecek.

        HashSet<Integer> hs1 = new HashSet<Integer>();  // Sadece int alabilen bir Set tanımlandı.
        Set<Integer> hs2 = new HashSet<Integer>();   // sadece int alabilen bir set tanımlandı.
        Set<Integer> hs3 = new HashSet<>();    // sadece int alabilen bir set tanımladım ->  todo// Önerilen


        Set hsObject = new HashSet();   // Bu tanımlamada her turlu degisken atanabilr, butun tipler
        // butun tipleri kapsayan tipin adı :  Object -> Nesne -> her şeyin atası
        // Bu tanımlama digerlerine göre yavaş çalışır ve farklı elemanlar atanabildiginden
        // tutarsız olabilir veriler, biraz kontrol duşu oluyor.
        // zorunlu degilsen kullanma

        hsObject.add("12");
        hsObject.add(12);

        Set<Integer> hs = new HashSet<>();   // sadece int alabilen bir set tanımladım -> Önerilen

        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);


        boolean eklendi_Mi = hs.add(5);   // tekrar işleme girdi ama eklenmedi
        boolean eklendi_Mi2 = hs.add(7);  // tekrar işleme girdi ama eklenmedi

        System.out.println("eklendi_Mi : " + eklendi_Mi);
        System.out.println("eklendi_Mi2 : " + eklendi_Mi2);

        // 1. Yöntem yazdırma
        System.out.println("hs : " + hs);    // hs = [1,34,3,5,7]
        // 1- sırası neden böyle : HashSet hızlı çalışmak için, belli bir (hash) bir
        // algoritmaya göre sıraya dizdi.
        // 2- ikinci eklenen 5 ve 7 neden eklenmedi: Çunku setler tekrarları almaz.



        // 2. Yöntem yazdırma, elamanlara tek tek ulaşma
        for (Integer eleman : hs) {

            System.out.println("eleman : " + eleman);
        }



        // 3. Yöntem Iterator
        Iterator it = hs.iterator();   // hs nin başına konumlandı.

        while (it.hasNext()) {    // iteratörun konumlandıgı yere göre sonrasında eleman var ise

            Integer eleman = (Integer) it.next();   // göstergenin gösterdigi elemanı ver. tipi Obje.
            System.out.println("it : eleman : " + eleman);

            if (eleman == 34) {

                it.remove();  // daha hızlı silme işlemi yapabiliyor.
            }
        }

        System.out.println("it remove sonrası hs : " + hs);

        hs.remove(5);   // sadece 5 degerli elemanı siler.
        System.out.println("remove 5 sonrası hs : " + hs);

        if(hs.contains(5)) {   // 5 degerinde eleman var mı
            System.out.println("5 var");
        }else{
            System.out.println("5 yok");   // burası çalıştı, çunku silmiştik.

            hs.clear();
            System.out.println("Clear sonrası hs : " +hs);

        }
    }
}
