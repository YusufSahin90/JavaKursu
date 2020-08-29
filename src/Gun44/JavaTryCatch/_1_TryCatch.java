package Gun44.JavaTryCatch;

import java.util.Scanner;

public class _1_TryCatch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try{  // hatanın olma ihtimalinin oldugu kodlar bu bloga alınır.
            System.out.print("1. sayıyı giriniz:");
            int a = sc.nextInt();

            System.out.print("2. sayıyı giriniz:");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (Exception hata) {   // hata oldugunda çalışacak bolum

            System.out.println("hata oldu");
//            System.out.println("hata.getMessage() = " + hata.getMessage());
//            hata.printStackTrace();
            System.out.println("2. sayıyı 0 vermeyiniz.");
        }
        // 2. sayı sıfır girildiginde AritmeticException
        // harf girildiginde ise InputMismatchException hatası veriyor.

    }
}
