package Gun15_Project1;

import java.util.Scanner;

public class HaftaninSorulari {
    public static void main(String[] args) {

//        1-  Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.
//        2- bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak vererek
//           sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.
//        3-Girilen 5 sayının toplamını ekrana yazdırınız.
//        4- 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız
//        5-Bir çalışanın başlangıç maaşı 2000 tl olsun.her yıl %15 zam yapılırsa,
//          5 yıl sonra çalışanın maaşı kaç lira olur.


//        2- bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak vererek
//           sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.


        Scanner sc = new Scanner(System.in);

        int tutulanSayı = (int)(Math.random()*10) +1;
        int sayac = 1;

        while(sayac <= 3){   // for (int sayac = 0; sayac <= 3; sayac++)  = for ile yaparsak bu şekilde...


            System.out.println("Sayıyı tahmin edin : ");
            int tahmin = sc.nextInt();

            if(tutulanSayı == tahmin){

                System.out.println("Tebrikler...");
                break;
            }
            else
                System.out.println("Tekrar deneyiniz");
            sayac++;


        }
        if(sayac == 4)
        System.out.println("Hakkınız bitti.! Bulamadınız.Tutulan Sayı: " + tutulanSayı);


        //   4-) 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız


     /*   for(int i = 1; i <= 255;i++){

            char c = (char)i;    // bilgisayar harfleri bilmez, bu sebeple saklayamaz.
            // bu yüzden karakterleri karşılık gelen bir sayı ile saklar.
            // bu yüzden char yani karakterler aslında sayı oalrak saklanır.
            // bu özellikten dolayı char saklacanak yere direk karakterin karşılık gelen sayısı atanabilir.
            // yani A harfi de atanabilir, 65 i char a çevirip de atanabilir.
            System.out.println(i + " - " + c);
        }

        int i = 0;
        while(i <= 255){

            char c = (char)i;
            System.out.println(i + " - " + c);
            i++;
        }

      */

    }
}
