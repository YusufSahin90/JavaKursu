package Gun11;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir sayının pozitif mi, negatif mi oldugunu yazdırınız.
        // 3 ihtimal p,n,sıfır

        System.out.print("Lütfen sayı giriniz: ");
        int sayı = sc.nextInt();

        if (sayı > 0)
            System.out.println("pozitif");
        else  // 2 ihtimal daha var negatif veya sıfır olabilir.
            if (sayı < 0)
                System.out.println("negatif");
            else
                System.out.println("sıfır");








    }
}
