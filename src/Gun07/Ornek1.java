package Gun07;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

//        Kullanıcıdan alacağınız bir kelimenin son harfini yazdırınız.


        Scanner scanner =new Scanner(System.in);

     /*   System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        System.out.println("Son harfiniz: " + kelime.charAt(kelime.length() -1));

      */

//        ya da

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

//       uzunluk adedi veriyordu, son index i ise length-1 verecektir.
        int uzunluk = kelime.length();
        char sonharf = kelime.charAt(uzunluk -1);

        System.out.println("Son harfiniz: " + sonharf);











    }
}
