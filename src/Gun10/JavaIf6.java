package Gun10;

import java.util.Scanner;

public class JavaIf6 {
    public static void main(String[] args) {
         // girilen 3 sayıdan en buyuk olanını bulunuz.

        Scanner sc = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        int sayı1 = sc.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        int sayı2 = sc.nextInt();

        System.out.print("ucuncu sayıyı giriniz: ");
        int sayı3 = sc.nextInt();

        int enBuyuk = sayı1;

        if (sayı2 > enBuyuk)
            enBuyuk = sayı2;

        if (sayı3 > enBuyuk)
            enBuyuk = sayı3;
        System.out.println("enBuyuk : " + enBuyuk);
    }
}
