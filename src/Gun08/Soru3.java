package Gun08;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        // Kullanıcıdan alacagınız 3 kelimelik ismin her kelimesini
        // ayırarak ayrı ayrı yazdırınız.
        // Örnek: Ahmet Emin Yıldız

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız ve soyadınız (Örnek: Ahmet Emin Yılmaz) : ");
        String adAd2Soyad = scanner.nextLine();

        int ilkboslukIndex = adAd2Soyad.indexOf(" ");
        int sonbolukIndex = adAd2Soyad.lastIndexOf(" ");

        String ad = adAd2Soyad.substring(0, ilkboslukIndex);                 // Ahmet
        String ad2 = adAd2Soyad.substring(ilkboslukIndex +1, sonbolukIndex); // Emin
        String soyad = adAd2Soyad.substring(sonbolukIndex +1);               // Yıldız

        System.out.println("Ad : " + ad);
        System.out.println("Ad2 : " + ad2);
        System.out.println("Soyad : " + soyad);












    }
}
