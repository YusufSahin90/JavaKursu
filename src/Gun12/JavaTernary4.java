package Gun12;

import java.util.Scanner;

public class JavaTernary4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();

        int sonuc;

        sonuc = (sayı > 50) ? 1 : 0;    // 2. yöntem :  sonuc = sayı > 50 ? 1 : 0;
        System.out.println(sonuc);

    }
}
