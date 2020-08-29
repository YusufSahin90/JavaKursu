package Gun16;

import java.util.Scanner;

public class ForLoop4 {

    public static void main(String[] args) {

        //  Girilen bir sayının faktöriyelini hesaplayınız.
        // 5! = 5*4*3*2*1

        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayı = sc.nextInt();

        int faktöriyel = 1;

        for (int i = 1; i <= sayı; i++){

            faktöriyel = faktöriyel * i;

        }
        System.out.println("faktöriyel : " + faktöriyel);


    }
}
