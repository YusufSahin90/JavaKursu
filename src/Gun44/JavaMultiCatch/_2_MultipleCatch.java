package Gun44.JavaMultiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _2_MultipleCatch {
    public static void main(String[] args) {


        // kullanıcıdan 5 kez 2 adet sayı alınız ve bolum sonucunu ekranda gösteriniz.
        for (int i = 0; i < 5; i++) {


            try {
                System.out.print("1. sayıyı giriniz:");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();

                System.out.print("2. sayıyı giriniz:");
                Scanner sc2 = new Scanner(System.in);
                int b = sc2.nextInt();

                int c = a / b;
                System.out.println("c = " + c);


            } catch (ArithmeticException hata) {   // oluşan hataya ilişkin bir catch var ise önce oraya duser

                System.out.println("hata oldu");
                System.out.println("2. sayıyı 0 vermeyiniz.");
                i--;  // hatalı girildiginde for u hatalı adımını tekrar etmesi için sayacı 1 azalttık

            } catch (InputMismatchException hata) {  // buraya ustteki hataya duşmezse duser

                System.out.println("hata oldu");
                System.out.println("Lutfen sayı giriniz.");
                i--;  // hatalı girildiginde for u hatalı adımını tekrar etmesi için sayacı 1 azalttık.


            }
        }
    }
}



