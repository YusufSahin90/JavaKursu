package Gun18;

import java.util.Scanner;

public class JavaArray3 {

    public static void main(String[] args) {

        // 5 elemanlı int bir dizi tanımlayınız. Kullanıcıdan degerleri alarak
        // bu diziyi doldurunuz. Daha sonra ortalamadan buyuk eleman sayısını bulunuz.

        int[] dizi = new int[5];  //  0,1,2,3,4  // Burada int[] köşeli parantez içine ne yazarsak, bizden o kadar input
                                                 //  isteyecek.

        Scanner sc = new Scanner(System.in);

        int toplam = 0;

        for(int i = 0; i < dizi.length; i++ ){

            System.out.println("sayı giriniz : ");
            dizi[i] = sc.nextInt();
            toplam = toplam + dizi[i];
        }

        int ort = toplam / dizi.length;

        int ortGecenMik = 0;
        for(int i = 0; i < dizi.length; i++){

            if (dizi[i] > ort)
                ortGecenMik++;
        }

        System.out.println("ortGecenMik : " + ortGecenMik);










    }
}
