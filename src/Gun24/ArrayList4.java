package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandıgımız gibi,
        // ArrayLİst i Collection metodlarını kullanacagız.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Sıralı degil : " + numbers);

        // Sıralama yapar

        Collections.sort(numbers);
        System.out.println("Sıralı : " + numbers);

        // en buyuk degeri bulur

        int max = Collections.max(numbers);

        // en kucuk degeri bulur

        int min = Collections.min(numbers);

        // listeyi tersine çevirir

        Collections.reverse(numbers);
        System.out.println("ters : " + numbers);

        // butun elemanlara bir deger atama

        System.out.println("fill den önce : " + numbers);
        Collections.fill(numbers,101);
        System.out.println("fill den sonra : " + numbers);

        // belli bir deger sahip elemanları yenisi ile degistirir

        Collections.replaceAll(numbers,101,5);


    }
}
