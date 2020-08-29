package Gun08;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örnek: Ahmet Emin Yılmaz -> A.E.Y. formatıyla yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz : ");
        String adAd2soyad = scanner.nextLine();

        // Ahmet Emin Yılmaz
        // A : adAd2Soyad.Charat(0);
        // E : 1. bosluk karakteriin indexinin 1 fazlası
        // Y : son boslugun indexinin 1 fazlası

        char adilkharf = adAd2soyad.charAt(0);
        char ad2ilkharf = adAd2soyad.charAt(adAd2soyad.indexOf(" ") +1);
        char soyadilkharf = adAd2soyad.charAt(adAd2soyad.lastIndexOf(" ")+1);





        // 2. yöntem

        int ilkboslukIndex = adAd2soyad.indexOf(" ");
        int sonboslukIndex = adAd2soyad.lastIndexOf(" ");

        ad2ilkharf = adAd2soyad.charAt(ilkboslukIndex +1);
        soyadilkharf = adAd2soyad.charAt(sonboslukIndex +1);



        System.out.println(adilkharf + "."+ad2ilkharf+ "." + soyadilkharf+ ".");


















    }
}
