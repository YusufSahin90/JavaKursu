package Gun06;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız.

        System.out.print("********  Adınızı ve Soyadınızı giriniz  ******** : ");
        String adsoyad = scanner.nextLine();     // Ekrandan bir satır okuyor.
        System.out.println("AdSoyad : " + adsoyad);




    }
}
