package Gun51.JavaPolymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("ozal","soyad","ogrenci","4a");

        Calisan cal1 = new Calisan("faruk","soyad","ogretmen","egitim");

        Kisi.kimlikYaz(ogr1);
        System.out.println();
        Kisi.kimlikYaz(cal1);

        // ogr1 nesnesinin ait oldugu Class ın basit adı
        System.out.println(ogr1.getClass().getSimpleName());

        // ogr1 nesnesinin ait oldugu calss ın ust class ının basit adı
        System.out.println(ogr1.getClass().getSuperclass().getSimpleName());





        



        /*

        Burada öğrenci için sube , Çalışan için departmanı nasıl yazdırırdınız.

         */

    }

}
