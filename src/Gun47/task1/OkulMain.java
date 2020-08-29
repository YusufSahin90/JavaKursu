package Gun47.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul1 = new Okul("Kabataş Lisesi", 3);

        ArrayList<Ogrenci> okulunOgrenciler = okul1.getOgrenciler();
        // burada okul1 oluşturulurken oluşan ArrayList get methodu ile alındı.

        int ogrenciSayisi = 1;

        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        do {

            System.out.print(ogrenciSayisi + ".Ogrencinin Adı: ");
            String ogrAd = sc.nextLine();

            System.out.print(ogrenciSayisi + ".Ogrencinin Soyadı: ");
            String ogrSoyad = sc.nextLine();

            System.out.print(ogrenciSayisi + ".Ogrencinin Yasi:");
            int yas = scInt.nextInt();

            try {

                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, yas);
//                okul1.getOgrenciler().add(ogr);
                okulunOgrenciler.add(ogr);  // alınan ArrayListe ogrenci eklendi.
                ogrenciSayisi++;

            } catch (Exception ex) {

                System.out.println(ex.getMessage());
                System.out.println("Yeni ogrenci giriniz");

            }
        } while (ogrenciSayisi <= okul1.getMaxOgrenciSayisi());

        for (Ogrenci ogr : okul1.getOgrenciler()) {

            System.out.println("ogr = " + ogr);
        }
    }
}
