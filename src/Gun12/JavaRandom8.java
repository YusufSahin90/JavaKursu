package Gun12;

import java.util.Scanner;

public class JavaRandom8 {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.print("sayı : ");
        int kacaKadarRamdomSayı = sc.nextInt();

        int uretilenSayı = (int) (Math.random() *kacaKadarRamdomSayı);

        System.out.print("Sayı tahmininiz : ");
        int tahmin = sc.nextInt();

        if (uretilenSayı == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemediniz. Tekrar deneyin.");
        System.out.println("uretilen Sayı: " + uretilenSayı);


    }
}
