package Gun11;

import java.util.Scanner;

public class ifElseLogic7 {
    public static void main(String[] args) {

        // bir otopark ucret hesaplama programı yapılmak isteniyor.
        // 0-2 saat arası 5 tl, 2-5 arası 10 tl, 5 saat ten sonra 15 tl olarak
        // saat girildiginde ucreti yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.print("Hangi saatler arası park edeceksiniz ? : ");
        int saat = sc.nextInt();


        if (saat <= 2)
            System.out.println("5 TL");
        else if (saat <= 5)
            System.out.println("10 TL");
        else
            System.out.println("15 TL");









    }
}
