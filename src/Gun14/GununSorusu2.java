package Gun14;

import java.util.Scanner;

public class GununSorusu2 {
    public static void main(String[] args) {

        //   2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz: ");
        int sayi = sc.nextInt();

        int yuzlerBasamagı = sayi / 100; // 3 basamaktan büyük olsaydı birde %10 almak gerekirdi
        int onlarBasamagı = (sayi / 10) % 10;
        int birlerBasamagı = sayi % 10;


        switch (yuzlerBasamagı) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
        System.out.println("yüz");

        switch (onlarBasamagı) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
        }

        switch (birlerBasamagı) {
            case 1:
                System.out.println("yüz");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


        }
    }
}
