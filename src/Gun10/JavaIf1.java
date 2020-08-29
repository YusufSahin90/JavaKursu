package Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {
        // girilen bir sayının 10 dan buyuk ise ekrana 10 dan buyuk diye yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayı = sc.nextInt();

        if (sayı > 10) {      // if in içinde yapılacaklar 1 satırdan fazla ise suslu parantez şart. 1 tane ise değil.
            System.out.println("sayı 10'dan buyuk'tur...");

        }
    }

}
