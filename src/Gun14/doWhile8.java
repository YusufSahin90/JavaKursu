package Gun14;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {

        // kullanıcıdan sıfır girilene kadar sayı isteyiniz.
        // bu soruyu önce while ile çozunuz. Sonra do-While.

        Scanner sc = new Scanner(System.in);
        int sayı = 0;
//        System.out.println("sayı giriniz: ");
//        int sayı = sc.nextInt();
//
//
//
//        while (sayı != 0){                          // sayı != 0; demek, sıfır girilene kadar döngü devam etsin.
//            System.out.println("sayı giriniz: ");
//            sayı = sc.nextInt();
//        }


        // **************** do-While ile yapımı ******************

        // burada döngu içine mutlaka ilk kez girilir, işlemler yazılır, sonra döngu şartı
        // geçerli ise döngu dönmeye başlar.

        do{
            System.out.print("Sayı giriniz: ");
            sayı = sc.nextInt();
        } while(sayı != 0);                              // sayı != 0; demek, sıfır girilene kadar döngü devam etsin.


    }
}
