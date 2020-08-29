package Gun13;

import java.util.Scanner;

public class IfinIf1 {
    public static void main(String[] args) {

        // girilen bir sayının önce 100 den kucuk ise, 100 den kucuk yazsın.
        // devamında 50 den kucuk ise 50 den kucuk yazsın.
        // devamında 25 den kucuk ise 25 den kucuk yazsın.

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayı = sc.nextInt();

        if (sayı < 100) {
            System.out.println("100 den kucuk");

            if (sayı < 50) {
                System.out.println("50 den kucuk");

                if (sayı < 25){
                System.out.println("25 den kucuk");
            }
        }
            }
        }

}



