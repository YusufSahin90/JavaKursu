package Gun16;

import javax.swing.*;
import java.util.Scanner;

public class JavaContinueStatement8 {

    public static void main(String[] args) {

        //  Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç,
        // digerlerini toplamını bulunuz.

        Scanner sc = new Scanner(System.in);



        int toplam = 0;

        for(int i = 1; i <= 5; i++){

            System.out.print("sayı giriniz: ");
            int sayı = sc.nextInt();

            if(sayı > 5 && sayı < 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında oldugundan toplanmayacak");
                continue;
            }else{
                    toplam = toplam + sayı;   // toplam += sayı;
            }

                System.out.println("toplam : " + toplam);


        }
    }
}
