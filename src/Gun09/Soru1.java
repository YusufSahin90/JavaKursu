package Gun09;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // Girilen 2 kelimelik ad ve soyadların ilk harflerinin
        // hepsini kucuk ve daha sonra buyuk hallerini yazdırınız.
        // Ahmet Yıldız -> ahmet yıldız

        Scanner oku = new Scanner(System.in);
        System.out.print("Adınızı ve Soyadınız giriniz : ");
        String tamAd = oku.nextLine();

        int boslukIndex = tamAd.indexOf(" ");
        String ilkHarf = tamAd.substring(0,1).toLowerCase();     // a
        String ilkHarf2 = tamAd.substring(0,1).toUpperCase();    // A

        String soyadIlkHarf = tamAd.substring(boslukIndex +1,boslukIndex +2).toLowerCase();    // y
        String soyadIlkHarf2 = tamAd.substring(boslukIndex +1,boslukIndex +2).toUpperCase();   // Y

        System.out.println("ilkHarf : " + ilkHarf);
        System.out.println("soyadIlkHarf : " + soyadIlkHarf);

        String yeniTamAd = ilkHarf + // a
                            tamAd.substring(1, boslukIndex +1) + // hmet_
                            soyadIlkHarf + // y
                            tamAd.substring(boslukIndex +2); // ıldız

        String yeniTamAd2 = ilkHarf2 + // a
                tamAd.substring(1, boslukIndex +1) + // hmet_
                soyadIlkHarf2 + // y
                tamAd.substring(boslukIndex +2); // ıldız




        System.out.println("yeniTamAd :" +yeniTamAd);
        System.out.println("yeniTamAd2 :" + yeniTamAd2);




    }
}
