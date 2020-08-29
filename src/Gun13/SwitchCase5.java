package Gun13;

import java.util.Scanner;

public class SwitchCase5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir sayının onlar basamagının degerini yazı ile yazdırınız.
        // 176 onlar basamagı nasıl buluruz ?
        // önce 10 bölerim int bölme oldugundan elimde 17 kalır ben 7 ye ulaşmak istiyorum.
        // sonra çıkan sonucu %10 yaptıgımda 10 bolumundan kalanı yani son rakamı verir 7 yi.

        System.out.println("Bir sayı giriniz: ");
        int sayı = sc.nextInt();
        int onlar = (sayı / 10)%10;

        switch (onlar) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
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
            case 0:
                System.out.println("sıfır");
                break;
        }





    }
}
