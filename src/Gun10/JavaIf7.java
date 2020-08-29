package Gun10;

import java.util.Scanner;

public class JavaIf7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir sayının onlar basamağının tek mi çift mi olduğunu bulunuz.

        System.out.println("Lutfen bir sayı giriniz: ");
        int sayı = sc.nextInt();
        int onlar = (sayı / 10 ) % 10;

        if (onlar % 2== 0)
            System.out.println("sayı çift tir");
        if (onlar % 2==1)
            System.out.println("sayı tek tir");


    }
}
