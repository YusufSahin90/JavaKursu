package Gun16;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {

        // Kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner sc = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayı = sc.nextInt();

        int toplam = 0;

        for(int i = 1; i < sayı; i++){

            toplam = toplam + i;      // toplam += i;


        }
        System.out.println("toplam : " + toplam);





    }
}
