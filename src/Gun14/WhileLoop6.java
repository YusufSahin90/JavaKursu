package Gun14;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {

        // girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
        // girilen sayı dahil

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayı = sc.nextInt();


        while (sayı > 0)
        {  // eger girilen sayı dahil değil deseydi, o zaman sayı--; yi buraya koyacaktık.

            if (sayı % 2 == 1) {
                System.out.println("sayı: " + sayı);

            }
            sayı--; // sayı = sayı - 1;


        }
    }
}
