package Gun16;

import java.util.Scanner;

public class ForLoop6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Girilen string deki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın.

        System.out.println("bir kelime giriniz : ");
        String kelime = sc.nextLine();



        int adet = 0;

        for(int i = 0; i < kelime.length();i++){

            if(kelime.charAt(i) == 'a')
                adet++;

                if(kelime.charAt(i) == 'c')
                break;

            System.out.println("döngü içindeki işleme giren harfler : " + kelime.charAt(i));  // bu kodu c yi kesince hangi harflere kadar
                                                                           // çıktığını görmek için.
        }
            System.out.println("toplam a sayısı : " + adet);




    }
}
