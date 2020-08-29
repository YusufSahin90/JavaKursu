package Gun10;

import java.util.Scanner;

public class JavaIf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayı = sc.nextInt();




        if (sayı % 2==1)
            System.out.println("Sayı tektir ");

        if (sayı % 2==0)
            System.out.println("Sayı cifttir ");


    }
}
