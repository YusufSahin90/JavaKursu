package Gun11;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir sayının tek mi çift mi if ve else yöntemi ile yazdırınız.

        System.out.println("Lutfen bir sayı giriniz: ");
        int sayı = sc.nextInt();


        if (sayı % 2== 0)
            System.out.println("sayı çift tir");
        else
            System.out.println("sayı tek tir");







    }
}
