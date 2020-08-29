package Gun11;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {

        // Girilen bir ögrencinin notuna göre 50 den buyuk ise gectiniz,
        // kucuk ise kaldırın yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.println("Notunuzu giriniz: ");
        int ogrNot = sc.nextInt();

        if (ogrNot >= 50)
            System.out.println("geçtiniz.");

        if (ogrNot < 50)
            System.out.println("kaldınız.");

        // yukarıdaki 3 adet if in yerine, asagıdaki aynı görevi daha hızlı saglar cunku tek şart
        // kontrol eder asagıdaki yapı, yukarıdaki her iki if in şartını da kontrol eder.

        if (ogrNot >= 50)
            System.out.println("geçtiniz");
        else
            System.out.println("kaldınız.");










    }
}
