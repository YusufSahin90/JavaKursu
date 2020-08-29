package Gun07;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ad ve soyad giriniz: ");
        String adsoyad = scanner.nextLine();        // birden fazla kelime, yani satırı tumden okuyoruz.

        System.out.println("Ad ve soyadınız : " + adsoyad);

        char ilkharf = adsoyad.charAt(0);
        int bosluknerde = adsoyad.indexOf(" ");             // bu indexin 1 fazlası her zaman soyadın ilk harfidir.
        char soyadilkharf = adsoyad.charAt(bosluknerde +1);

        System.out.println(ilkharf + "." + soyadilkharf + ".");














    }
}
