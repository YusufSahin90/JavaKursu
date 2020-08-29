package Gun23;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods7 {
    public static void main(String[] args) {

        // 5 elemanlı bir diziyi kullanıcı doldurduktan sonra
        // bir fonksiyonda tek elemanlara 0 degeri atayınız.
        // diziyi main de yazdırınız.

        int[] dizi = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Sayı giriniz: ");
            dizi[i] = sc.nextInt();
        }
        System.out.println("Önce: " + Arrays.toString(dizi) );
        System.out.println("Sonra: " + Arrays.toString(teklereSifirAta(dizi) ) );

    }

    public static int[] teklereSifirAta(int[] dizi) {

        // eger dizinin elemanı tek ise 0 atanıyor.

        for(int i = 0; i < dizi.length; i++){

            if (dizi[i] % 2 == 1) {

                dizi[i] = 0;
            }
        }

        return dizi;
    }
}







