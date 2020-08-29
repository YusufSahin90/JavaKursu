package Gun14;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {

        // // girilen bir sayıya kadar (girilen sayı dahil) olan sayıların toplamını (sayac kullanmadan) bulunuz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayı = sc.nextInt();



        int toplam = 0;
        // 1 2 3 4 5 6 7     7 için önceki soruda
        // 7 6 5 4 3 2 1

        while (sayı > 0)
        {
            toplam = toplam + sayı;
            sayı--;

        }
        System.out.println("toplam: " + toplam);

    }
}









