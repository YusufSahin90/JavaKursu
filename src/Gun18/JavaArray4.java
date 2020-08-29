package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {

        // Kullanıcıdan alacagınız 7 sayıyı bir diziye atadıktan sonra
        // ayrı bir döngu ile kaç tanesinin tek sayı olduğunu bulunuz.

        int[] dizi = new int[7];

        Scanner sc = new Scanner(System.in);

        int tekMiktari = 0;

        for (int i = 0; i < dizi.length; i++) {

            System.out.print("Bir sayı giriniz : ");
            dizi[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(dizi));     // girdiğimiz sayıları köşeli parantez içinde yazıyor ve hepsini
                                                       // konsolda gösteriyor.


        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] % 2 == 1)         // tek ise
                tekMiktari++;



        }
        System.out.println(" Tek Miktarı : " + tekMiktari);

    }
}



