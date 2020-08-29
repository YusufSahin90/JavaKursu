package Gun12;

import java.util.Scanner;

public class JavaRandom10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan alt ve üst degeri tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max degeri) alarak sayı uretiniz ve ekrana yazıdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı.

        System.out.print("alt deger ve üst deger giriniz: ");
        String sayı = sc.nextLine();
        int bosluknerede = sayı.indexOf(" ");
        String min = sayı.substring(0,bosluknerede);
        String max = sayı.substring(bosluknerede +1);
        int sayı1 = Integer.parseInt(min);
        int sayı2 = Integer.parseInt(max);


        int numberInRange = (int) (Math.random()*((sayı2 - sayı1) + 1)) + sayı1;
        System.out.println("numberInRange: " + numberInRange);

        // Maht.random() -> 0 - 0,9999
        // 0 - 10 a kadar sayı uretmesini istersem :  Math.random*10 -> 0 - 9,999  -> 0 - 9  -> 10 dahil olması için +1
        // 2 ile 5 arası istiyorsam min 2 max 5
        // 3 e kadar olan sayıları buluyorum 0 - 3 + min -> 2 5 e karşılık gelir

    }
    
}



