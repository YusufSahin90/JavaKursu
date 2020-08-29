package Gun10;

import java.util.Scanner;

public class JavaIf5 {
    public static void main(String[] args) {

        // girilen bir sayının birler basamağını yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir sayı giriniz: ");
        int sayı = sc.nextInt();

        if (sayı < 0)             // bu bölüm sayı negatifse çalışacak
            sayı = sayı * -1;     // sayi =-sayi;

        int birler = sayı % 10;

        if (birler == 0)
            System.out.println("birler basamagı = sıfır dır" );
        if (birler == 1)
            System.out.println("birler basamagı = bir dir" );
        if (birler == 2)
            System.out.println("birler basamagı = iki dir" );
        if (birler == 3)
            System.out.println("birler basamagı = uc dur" );
        if (birler == 4)
            System.out.println("birler basamagı = dort dur" );
        if (birler == 5)
            System.out.println("birler basamagı = bes tir" );
        if (birler == 6)
            System.out.println("birler basamagı = altı dır" );
        if (birler == 7)
            System.out.println("birler basamagı = yedi dir" );
        if (birler == 8)
            System.out.println("birler basamagı = sekiz dir" );
        if (birler == 9)
            System.out.println("birler basamagı = dokuz dur" );






    }
}
