package Gun48.task2;

// 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
//  Shape(Sekil)  - class
//  Circle(Cember)   - class
//  Rectangle(Dikdortgen)  - class
//  Square(Kare)    - class
// bir tane de ana main class olucak

// 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
// 3- Her bir sınıfa consructor ekleyiniz.
// 4- Her metodun toStringini override yapınız.
// 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
// 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
// 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hata mesajı ürettiriniz.

import org.w3c.dom.ls.LSOutput;

public class GeometeriMain {
    public static void main(String[] args) {


        Dikdortgen dd = new Dikdortgen(4, 5);
        System.out.println("Dikdortgen : " + dd);  // oto toString çalışır.

        Kare kare = new Kare(6);
        System.out.println("kare : " + kare);

        Cember cember = new Cember(3);
        System.out.println("cember : " + cember);

        System.out.println("cember.getAlan() = " + cember.getAlan());

    }
}
