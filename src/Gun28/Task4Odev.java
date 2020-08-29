package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4Odev {
    public static void main(String[] args) {

        // Create method that generates a HashSet of
        // given numbers [1,2,3,4,5,5,5,6,7,8]
        // bu işlemi generateSet() metodunda yapınız.

        Set<Integer> hs = generateSet();
        System.out.println("hs : " + hs);   // hs = [1,2,3,4,5,6,7,8]

        // Sonra AddElements şeklinde bir metodlar 1 veya 1 den fazla sayı eklenebilen metodu yazınız.

        AddElements(hs,12, 14);
        AddElements(hs, 1,2,3,4,5,101,102,103);
        AddElements(hs,65);

        System.out.println("AddElements sonrası hs : " + hs);  // [1,65,2,3,4,5,101,6,102,7,103,8,12,14]

        // Sonra oluşmuş olan maindeki HashSet i convertToArray isimli bir metoda göndererek
        // main de bir Array e eşitleyiniz.

        // Sonra oluşmuş olan maindeki HashSet i convertToArrayList isimli bir metoda göndererek
        // main de bir ArrayList e eşitleyiniz.


    }

    public static Set<Integer> generateSet() {

        // 1. yöntem
        Set<Integer> hs = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8));

        // 2. yöntem
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);


        return hs;

    }
    public static void AddElements(Set<Integer> hs, int... sayilar){

        for(int i =0; i < sayilar.length; i++){

            hs.add(sayilar[i]);
        }
    }


}


