package Gun07;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {

       /*

        Günün Soruları

        // 3 isimlik bir ismi kısaca yazdırın z.m.d

        // 2 kelimelik bir isimde ad ve soyadı ayırın

        // 3 kelimelik bir isimde ad, ikinci ad ve soyad olarak ayırınız
           (Şöyle Ahmet Emin Yılmaz şeklinde girilen bir tam isimdeki bütün kelimeleri ayırınız)

        // bir stringin boş olup olmadığını kontrol ediniz

       */



        // 3 isimlik bir ismi kısaca yazdırın z.m.d

        Scanner scanner = new Scanner(System.in);

     /*  System.out.print("Lütfen isminizi giriniz : ");
        String isim = scanner.nextLine();

        char harf = isim.charAt(0);
        int bosluk = isim.indexOf(" ");
        char soyadilkharf = isim.charAt(bosluk +1);
        int bosluk2 = isim.lastIndexOf(" ");
        char soyadikinciharf = isim.charAt(bosluk2 +1);

        System.out.println("İsminiz : " + isim + "\n" + harf + "." + soyadilkharf + "." + soyadikinciharf + ".");

      */













        // 2 kelimelik bir isimde ad ve soyadı ayırın.

     /*   System.out.print("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();

        int bosluk = isim.indexOf(" ");

        System.out.println("Adınız: " + isim.substring(0,bosluk));
        System.out.println("Soyadınız: " + isim.substring(bosluk));

      */


    /*    //   2. yöntem olarak söyle yapabiliriz!

        String isim2 = "GeorgeFloyd";


        System.out.println("Adınız: " + isim2.substring(0,6) + "\n" + "Soyadınız: " + isim2.substring(6));

     */








        // 3 kelimelik bir isimde ad, ikinci ad ve soyad olarak ayırınız.
       // (Şöyle Ahmet Emin Yılmaz şeklinde girilen bir tam isimdeki bütün kelimeleri ayırınız)

     /*   System.out.print("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();

        int bosluk = isim.indexOf(" ");
        int bosluk2 = isim.lastIndexOf(" ");

        System.out.println("Adınız:" + isim.substring(0,bosluk));
        System.out.println("2. Adınız:" + isim.substring(bosluk+1,bosluk2));
        System.out.println("Soyadınız:" + isim.substring(bosluk2+1));

      */




        // 2. yöntem olarak söyle yapabiliriz!

     /*   String isim2 = "GeorgeFloydAmerika";

        System.out.println("Adınız: " + isim2.substring(0,6) + "\n" + "2.Adınız: " + isim2.substring(6,11)
                + "\n" + "Soyadınız: " + isim2.substring(11));

      */









        // bir stringin boş olup olmadığını kontrol ediniz

     /*   String str = "Techno Study";

        System.out.println("str içi boşmu oder ? : " + str.isEmpty());

        String str1 = "";
        boolean bosmu = str1.isEmpty();
        System.out.println("str1 içi boş mu oder ? :" + bosmu);

        String str2 = " ";
        System.out.println("str2 içi boş mu oder ? :" + str2.isEmpty());

      */
























}

}