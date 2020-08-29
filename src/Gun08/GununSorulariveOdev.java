package Gun08;

import java.util.Scanner;

public class GununSorulariveOdev {
    public static void main(String[] args) {

        /*  1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
               hepsini küçük ve daha sonra büyük hallerini yazdırınız.
            2- Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun
            3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.
            4- Kullanıcıdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını,
               büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız.

        */



     //   1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
     //   hepsini küçük ve daha sonra büyük hallerini yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen 2 veya 3 kelimeli bir isim giriniz :");
        String isim = sc.nextLine();
        //Ahmet Yılmaz

        char AdİlkHarf = isim.charAt(0);
        int bosluk = isim.indexOf(" ");


        String adKucuk = isim.substring(0,1).toLowerCase();  // ismin ilk harfi kucuk
        String adBuyuk = isim.substring(0,1).toUpperCase();  // ismin ilk harfi buyuk

        String soyadKucuk = (isim.substring((bosluk +1),(bosluk +2))).toLowerCase();
        String soyadBuyuk = (isim.substring((bosluk +1),(bosluk +2))).toUpperCase();

        String adKelime = isim.substring(1,bosluk);
        String soyadKellime = isim.substring(bosluk +2);




        System.out.println("Original hali: " + isim);
        System.out.println(adKucuk + adKelime + " " + soyadKucuk + soyadKellime );
        System.out.println(adBuyuk + adKelime + " " + soyadBuyuk + soyadKellime );








        /*   1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
            hepsini küçük ve daha sonra büyük hallerini yazdırınız.       */

     /*   Scanner scanner = new Scanner(System.in);
        System.out.print("Ad Soyad : ");
        String ad_soyad = scanner.nextLine();

        // ahmet yılmaz

        int bosluknerde = ad_soyad.indexOf(" ");

        String ad_kucuk = (ad_soyad.substring(0,1)).toLowerCase();
        String ad_buyuk = (ad_soyad.substring(0,1)).toUpperCase();

        String soyad_kucuk = (ad_soyad.substring((bosluknerde+1),(bosluknerde+2))).toLowerCase();
        String soyad_buyuk = (ad_soyad.substring((bosluknerde+1),(bosluknerde+2))).toUpperCase();

        String ad_kelime = ad_soyad.substring(1,bosluknerde);
        String soyad_kelime = ad_soyad.substring(bosluknerde + 2);

        System.out.println(ad_kucuk + ad_kelime +  " " + soyad_kucuk + soyad_kelime );
        System.out.println(ad_buyuk + ad_kelime +  " " + soyad_buyuk + soyad_kelime );
         
      */














    //    2- Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun.

     /*   System.out.print("Lütfen bir kelime giriniz : ");
        String kelime = sc.nextLine();

        System.out.println("a var mı ? : " + kelime.contains("a"));
        System.out.println("selam var mı ? : " + kelime.contains("selam"));
        System.out.println("sen var mı ? : " + kelime.contains("sen"));
        System.out.println("SEN var mı ? : " + kelime.contains("SEN"));


      */










     //   3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.

     /*   System.out.print("Lütfen birşeyler giriniz : ");
        String str = sc.nextLine();

        System.out.println("boşluklar -> (_) ile değişiyor : " + str.replaceAll("[ ]", "_"));

      */








      //   4- Kullanıcıdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını,
      //      büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız.

     /*   System.out.print("Lütfen parolanızı giriniz : ");
        String str = sc.nextLine();

        System.out.println("Parola doğru mu ? : " + str.equalsIgnoreCase("AsD123456"));

      */












    }

}
