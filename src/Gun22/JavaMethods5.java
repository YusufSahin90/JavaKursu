package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods5 {

    public static void main(String[] args) {

        // Kullanıcıya aşağıdaki gibi bir menü çıakrtarak sürekli değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplam
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner sc = new Scanner(System.in);
        int secim = 0;

        do {
            menuYaz();
            secim = sc.nextInt();
            islemYap(secim);
        } while (secim < 6);

    }

    public static void menuYaz(){

        System.out.println("***** Menu *****");
        System.out.println("1. toplama");
        System.out.println("2. çıkarma");
        System.out.println("3. çarpma");
        System.out.println("4. bölme");
        System.out.println("5. faktöriyel");
        System.out.println("6. Çıkış");
        System.out.print("Seçiminiz: ");
    }
    public static void islemYap(int secim) {

        Scanner sc = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 0;
        switch (secim) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1. Sayı : ");
                sayi1 = sc.nextInt();
                System.out.print("2. Sayı : ");
                sayi2 = sc.nextInt();
                break;
            case 5:
                System.out.print("Sayı : ");
                sayi1 = sc.nextInt();
        }

        switch (secim) {
            case 1:
                toplamYaz(sayi1, sayi2);
                break;
            case 2:
                cikartmaYaz(sayi1, sayi2);
                break;
            case 3:
                carpmaYaz(sayi1, sayi2);
                break;
            case 4:
                bolmeYaz(sayi1, sayi2);
                break;
            case 5:
                faktoriyelYaz(sayi1);
                break;
        }

    }


        public static void toplamYaz ( int s1, int s2){

            System.out.println("Toplam : " + (s1 + s2));

        }
        public static void cikartmaYaz ( int s1, int s2){

            System.out.println("Cıkartma : " + (s1 - s2));

        }
        public static void carpmaYaz ( int s1, int s2){

            System.out.println("Carpma : " + (s1 * s2));

        }
        public static void bolmeYaz ( int s1, int s2){

            System.out.println("Bolme : " + (s1 / s2));

        }
        public static void faktoriyelYaz ( int s1){

            int faktoriyel = 1;
            for (int i = 1; i <= s1; i++) {
                faktoriyel = faktoriyel * i;
            }

            System.out.println("Faktoriyel : " + faktoriyel);

        }

}
