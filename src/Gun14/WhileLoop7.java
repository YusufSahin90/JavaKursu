package Gun14;

import java.util.Scanner;

public class WhileLoop7 {
    public static void main(String[] args) {

        // kullanıcıdan 5 sayı isteyiniz, bu sayılardan en buyugunu bularak yazdırınız.

        Scanner sc = new Scanner(System.in);


        int sayac = 0;
        int max = 0;


        while(sayac < 5) {
            System.out.print("sayı giriniz: ");
            int sayı = sc.nextInt();
            max = Math.max(max, sayı);

            sayac++;
        }
        System.out.println("max: " + max);



        // 2. *******************  Yöntem  ****************

      /*  int max = 0;
        int sayac = 1;

        while (sayac <= 5){
            System.out.print(sayac + ".Sayı giriniz: ");
            int sayı = sc.nextInt();
            if (sayı > max)
                max = sayı;

            sayac++;
        }
        System.out.println("max: " + max);

       */


    }
}
