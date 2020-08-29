package Gun19;

import java.util.Scanner;

public class JavaStringSplitMethod4 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir cümleyi kelimelerine bölerek alt alta yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle = sc.nextLine();

        String[] kelimeler = cumle.split(" "); // boşluk karakterine göre böler ve diziye atar

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }

        //2.yöntem foreach
        System.out.println();
        for (String elemanDegeri : kelimeler) {
            System.out.println(elemanDegeri);
        }
    }
}








