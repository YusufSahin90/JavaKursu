package Gun06;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayının bilgilerini alıp  toplamını konsola yazdırınız.


        System.out.print("Birinci sayı : ");
        int sayı1 = scanner.nextInt();
        System.out.print("İkinci sayı : ");
        int sayı2 = scanner.nextInt();

        System.out.println("Toplamları : " + (sayı1 + sayı2));    // paranteze alırsak java işlem olarak görür ve işlem
                                                                  // yapar.


        System.out.println("Toplamları : " + sayı1 + sayı2);     // bu şekilde yazarsak java String olarak algılıyor
                                                                 // ve yan yana yazıyor, toplamıyor.





    }
}
