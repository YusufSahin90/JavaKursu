package Gun10;

import java.util.Scanner;

public class JavaIf2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir sayının negatif mi, pozitif mi oldugunu yazdırınız.

        System.out.println("Lutfen bir sayı giriniz: ");
        int sayı = sc.nextInt();

        if (sayı > 0) {
            System.out.println("pozitif");
        }
        if (sayı < 0) {
            System.out.println("negatif");
        }
        if (sayı==0) {
            System.out.println("sayı sıfırdır");
        }



    }
}
