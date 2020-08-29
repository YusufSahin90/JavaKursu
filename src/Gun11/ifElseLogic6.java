package Gun11;

import java.util.Scanner;

public class ifElseLogic6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen yeni bir passwordun kurallara uygunluğunu kontrol ediniz.
        // kurallar : 1) en az 8 karakter olmalı
        //            2) içinde pass kelimesi olmamalı
        //            3) en fazla 12 karakter olmalı


        System.out.println("Parolanızı giriniz: ");
        String parola = sc.nextLine();


        if (parola.length() >= 8 && !parola.contains("pass") && parola.length() <= 12 )
            System.out.println("Parola doğru");
        else
            System.out.println("Parola yanlış");






    }
}
