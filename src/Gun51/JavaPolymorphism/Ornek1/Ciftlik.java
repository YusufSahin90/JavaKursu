package Gun51.JavaPolymorphism.Ornek1;

public class Ciftlik {
    public static void KopekSesi(Kopek kopek){

        kopek.ses();
    }


    public static void KediSesi(Kedi kedi){

        kedi.ses();
    }

    // Polymorphism imkanı ile 2 farklı subclass dan üretilmiş nesne
    // super class gibi biçimimnde (Çok biçimlilik) aynı metoda tek bir tipmiş
    // gibi gönderilebildi buna Polymorphism (Çok biçimlilik) denir.
    // üstteki metdolarla aynı yerde olması için, burada yazıldı, en doğruu
    // Hayvan class ında olması bu metodun.

    /*
    Çok Biçimlilik — Polymorphism Java’da farklı şekilde çalışan nesnelere aynı şekilde erişmek şeklinde tanımlayabiliriz.
    Diğer bir tanım olarak bir nesnenin farklı bir nesne gibi davranmasıdır…

     */
    /*
    Bir nesnenin davranış şekillerinin duruma göre
    değişebilmesidir.
    • Eğer birdençok sınıfın ortak kullanacağı bir metod
    varsa, bu herbirinin temel alacağı bir anasınıf
    içerisinde tanımlanabilir.
    – Davranış şekillerindeki farklılıklar her sınıfın kendi
    yapısı içinde ifade edilir.
    – Örneğin bir selam() metodu ekrana, Turkler icin
    “selam” İngilizler için “hello” Almanlar için “hallo”
    yazdıracak biçimde çeşitlendirilebilir.
     */

    public static void HayvanSesi(Hayvan hayvan)
    {
        hayvan.ses();

    }

    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabas");
        Kedi kedi1 = new Kedi("kopuk");

        kopek1.ses();
        kedi1.ses();
        kopek1.kokladi(); // referans tipi nesne tipi ile aynı
        // olduğunda bütüm özellik ve methodlar kullanılabiliyor.

        Hayvan kopek2=new Kopek("comar");
        Hayvan kedi2=new Kedi("pamuk");

        kopek2.ses();
        kedi2.ses();
        //kopek2.kokladi();
        // sadece sub clasa ait olan field ve methodlar
        // bu tanımlama tipinde ulaşılamaz.

        System.out.println("------------------------");
        KopekSesi(kopek1);
        KediSesi(kedi1);

        System.out.println("--------hayvan sesleri---------");
        HayvanSesi(kopek1);
        HayvanSesi(kedi1);

    }
}

//    Kopek kopek1                 =    new Kopek("karabaş");
//    referans tipi Kopek               nesnenin tipi (instance) Kopek
//
//    Hayvan kopek2                =    new Kopek("çomar");
//    referans tipi Hayvan              nesnenin tipi Kopek
