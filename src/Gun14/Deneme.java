package Gun14;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      /*  Günün Soruları
        1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

       */

        System.out.println("üç basamaklı bır sayı gırınız: ");
        int bb, ob, yb;
        try {
            int sayi = sc.nextInt();

            if (sayi > 99) {
                bb = sayi % 10;
                ob = sayi / 10;
                ob = ob % 10;
                yb = sayi / 100;
                System.out.println(bb);
                System.out.println(ob);
                System.out.println(yb);
                switch (yb) {
                    case 1:
                        System.out.print("bir");
                        break;
                    case 2:
                        System.out.print("iki");
                        break;
                    case 3:
                        System.out.print("üc");
                        break;
                    case 4:
                        System.out.print("dört");
                        break;
                    case 5:
                        System.out.print("beş");
                        break;
                    case 6:
                        System.out.print("altı");
                        break;
                    case 7:
                        System.out.print("yedi");
                        break;
                    case 8:
                        System.out.print("sekiz");
                        break;
                    case 9:
                        System.out.print("dokuz");
                        break;
                }

                switch (ob) {
                    case 0:
                        System.out.print("sifir");
                        break;
                    case 1:
                        System.out.print("bir");
                        break;
                    case 2:
                        System.out.print("iki");
                        break;
                    case 3:
                        System.out.print("üc");
                        break;
                    case 4:
                        System.out.print("dört");
                        break;
                    case 5:
                        System.out.print("beş");
                        break;
                    case 6:
                        System.out.print("altı");
                        break;
                    case 7:
                        System.out.print("yedi");
                        break;
                    case 8:
                        System.out.print("sekiz");
                        break;
                    case 9:
                        System.out.print("dokuz");
                        break;
                }

                switch (bb) {
                    case 0:
                        System.out.print("sifir");
                        break;
                    case 1:
                        System.out.print("bir");
                        break;
                    case 2:
                        System.out.print("iki");
                        break;
                    case 3:
                        System.out.print("üc");
                        break;
                    case 4:
                        System.out.print("dört");
                        break;
                    case 5:
                        System.out.print("beş");
                        break;
                    case 6:
                        System.out.print("altı");
                        break;
                    case 7:
                        System.out.print("yedi");
                        break;
                    case 8:
                        System.out.print("sekiz");
                        break;
                    case 9:
                        System.out.print("dokuz");
                        break;
                }
            } else System.out.println("girdıgınız sayı üç basamaklı deyıldır");
        } catch (Exception e) {
            System.out.println("hatalı gırıs yaptınız");
        }
    }
}








