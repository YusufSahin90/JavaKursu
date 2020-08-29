package Gun51.finalAttribute2;

public class Arabalar {
    public static void main(String[] args) {

        Araba araba = new Araba("opel");
        System.out.println(araba.model);

        // araba.model = "ford";
        // ilk deger sadece tanımlandıgı yerde veya constructor da atanabilir.
        // sonradan degistirilemez.

        Araba araba2 = new Araba("ford");
        System.out.println(araba2.model);


    }
}
