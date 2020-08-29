package Gun22;

import java.util.Scanner;

public class JavaMethods6 {
    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı isteyiniz, toplamını bir methodda yaprıtınız. sonucu mainde yazdırınız.

        Scanner sc = new Scanner(System.in);

        System.out.println("1. sayı : ");
        int sayı1 = sc.nextInt();

        System.out.println("2. sayı : ");
        int sayı2 = sc.nextInt();

        int sonuc = toplamYaz(sayı1, sayı2);
        System.out.println("sonuc : " + sonuc);

        int enb = enBuyuk(sayı1, sayı2);        // int enb = math.max(3,4);  bunun gibi
        System.out.println("enb : " + enb);
    }

    // void : geriye bir şey göndermeyen yani return olmayan demek. public static void ile tanımlıyoruz void de.
    // return : public static int ile tanımlıyoruz return da.

    public static int toplamYaz(int s1, int s2) {   // fonksiyondaki degiskenler göderilen degiskenlerle
                                                   // aynı isismde olmak zorunda degil, sırasına göre bire bir eşleşiyor.

        int toplam = s1 + s2;

        return toplam;  // return ile tanımlarsak public main içinde toplamı yazdırabiliriz.
    }

        public static int enBuyuk ( int s1, int s2){

            if (s1 > s2) {
                return s1;
            } else {
                return s2;
                // return Math.max(s1,s2);
            }
        }

}


