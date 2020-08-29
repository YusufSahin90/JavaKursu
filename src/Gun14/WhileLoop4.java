package Gun14;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {

        // girilen bir sayıya kadar (girilen sayı dahil) olan sayıların toplamını bulunuz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayı = sc.nextInt();


        int sayac = 1;
        int toplam = 0;

        while (sayac <= sayı){
            toplam = toplam + sayac;  // toplam+= sayac;
            sayac++;

        }
        System.out.println("toplam: " + toplam);

    }
}
