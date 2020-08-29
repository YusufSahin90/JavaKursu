package Gun12;

import java.util.Scanner;

public class JavaTernary3 {
    public static void main(String[] args) {

        // kullanıcının girecegi sayı ift ise bir stringe "çift" atayınız,
        // tek ise "tek" atayınız ve akrana stringi yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("sayı: ");
        int sayı = sc.nextInt();

        String text = " ";

      /*  if (sayı % 2 == 0)
            text = "çift";
        else
            text = "tek";

       */

        // ternary şekli (uclu operator şekli)

        text = (sayı % 2 == 0) ? "çift" : "tek";   // 2. yöntem : text = sayı % 2 == 0 ? "çift" : "tek";
        //          şart          dogru    yanlış      ( : else ye karşılık geliyor )


        System.out.println(text);
    }
}
