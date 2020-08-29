package Gun09;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        // Gunun soruları

        // 1- Girilen bir sayının birler basamagını ekrana yazdırınız.
        // 2- Girilen bir sayının onlar basamagını ekrana yazdırınız.
        // 3- Girilen bir sayının yuzler basamagını ekrana yazdırınız.
        // 4- Girilen 3 basamaklı bir sayının basamaklarının toplamını ekrana yazıdırınız.
              // -> 435 -> 4,3,5 => 4+3+5 = 12
        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız.
        //  Örneğin: 435 -> 534 sayı olarak bulunacak.
        // 6- 2020 yılına kadar geçen gun sayısını bulunuz.
        // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.



        // 1- Girilen bir sayının birler basamagını ekrana yazdırınız.

        Scanner sc = new Scanner(System.in);

     /*   System.out.print("Lütfen bir sayı giriniz: ");
        String sayı = sc.nextLine();

        int kacBasamak = sayı.length();
        char basamak1 = sayı.charAt(kacBasamak -1);
        System.out.println("Birler basamagı : " + basamak1);

      */


        // 2- Girilen bir sayının onlar basamagını ekrana yazdırınız.

     /*   System.out.print("Lutfen bir sayı giriniz : ");
        String sayı2 = sc.nextLine();

        int kacBasamak2 = sayı2.length();
        char basamak2 = sayı2.charAt(kacBasamak2 -2);
        System.out.println("Onlar basamagı : " + basamak2);

      */


        // 3- Girilen bir sayının yuzler basamagını ekrana yazdırınız.

        /*   System.out.print("Lutfen bir sayı giriniz : ");
        String sayı3 = sc.nextLine();

        int kacBasamak3 = sayı3.length();
        char basamak3 = sayı3.charAt(kacBasamak3 -3);
        System.out.println("Yuzler basamagı : " + basamak3);



      */




        // 4- Girilen 3 basamaklı bir sayının basamaklarının toplamını ekrana yazıdırınız.
        // -> 435 -> 4,3,5 => 4+3+5 = 12

     /*   System.out.print("Lutfen 3 basamaklı bir sayı giriniz : ");
        int sayı4 = sc.nextInt();


        int birler = sayı4 % 10;
        int onlar = (sayı4 / 10)%10;
        int yuzler = sayı4 / 100;

        System.out.println("birler basamagı : " + birler + "\n" + "onlar basamagı : " + onlar + "\n"
                            + "yuzler basamagı : " + yuzler);

        System.out.println("Basamaklar toplamı : " + (birler + onlar + yuzler) );

      */




        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız.
        //  Örneğin: 435 -> 534 sayı olarak bulunacak.

      /*  System.out.print("Lutfen 3 basamaklı bir sayı giriniz : ");
        int sayı = sc.nextInt();


        int birler = sayı % 10;
        int onlar = (sayı / 10)%10;
        int yuzler = sayı / 100;

        System.out.println("Degistirilmeden önce : " + yuzler + onlar + birler );
        System.out.println("Degistirildikten sonra : " + birler + onlar + yuzler );

       */

        // >---------------------------- 2. yöntem -------------------------------


     /*   System.out.print("Lutfen 3 basamaklı bir sayı giriniz : ");
        String sayı = sc.nextLine();

        int kacBasamak3 = sayı.length();
        char basamak1 = sayı.charAt(kacBasamak3 -1);
        char basamak2 = sayı.charAt(kacBasamak3 -2);
        char basamak3 = sayı.charAt(kacBasamak3 -3);

        System.out.println("Degistirilmeden önce : " + basamak3 + basamak2 + basamak1);
        System.out.println("Degistirildikten sonra : " + basamak1 + basamak2 + basamak3);

      */





























    }
}
