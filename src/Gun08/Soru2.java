package Gun08;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı ve soyadınızı giriniz: ");
        String adSoyad = scanner.nextLine();

        // Ahmet Yılmaz     substring(baslangıc index, e akdar - dahil degil)

        int bolukIndex = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, bolukIndex);
        String soyad = adSoyad.substring(bolukIndex +1);

        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);











    }
}
