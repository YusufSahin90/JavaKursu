package Gun27;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {

        // Array->ArrayList->Set ?
        // Collections :  koleksiyonlar
        // HashSet : kendine göre bir algoritma ile sıralayarak saklıyor Gezinme hızlı.
        // LinkedHashSet :  Kullanıcının ekleme sırasına göre saklıyor
        // TreeSet :  her veri girildiginde tum verileri KUCUKTEN BUYUGE olacak şekilde sıralayarak saklıyor.
        // Avantajı : aynı elemanı 2 kez eklemiyor.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list : " + list);

        // Set<Integer> hs = new HashSet<>();    // Bu şekilde de tanımlanabilir.
        HashSet<Integer> hs = new HashSet<>();

         boolean eklediMi_1 = hs.add(1);  // true
         boolean eklediMi_2 = hs.add(2);  // true
         boolean eklediMi_3 = hs.add(3);  // true
         boolean eklediMi_4 = hs.add(3);  // Daha önceki eklendigi için eklenmeyecek sonuc: false
         boolean eklediMi_5 = hs.add(2);  // Daha önceki eklendigi için eklenmeyecek sonuc: false

        System.out.println("eklediMi : " + eklediMi_5);

        System.out.println("hs : " + hs);


    }
}
