package Gun11;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz.
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.


        Scanner sc = new Scanner(System.in);

        System.out.println("Vize notunu giriniz: ");
        double vize = sc.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        double fnl = sc.nextInt();

        double ortalama = (vize*40/100) + (fnl*60/100);

        if (ortalama > 60)
            System.out.println("Geçtiniz... Tebrikler");
        else
            System.out.println("Bütünlemeye kaldınız...Dersi tekrar almayı düşünebilirsiniz...");








    }
}













