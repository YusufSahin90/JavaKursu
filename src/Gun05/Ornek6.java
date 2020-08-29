package Gun05;

public class Ornek6 {
    public static void main(String[] args) {

//        sayılar arası dönüşüm

        int sayi = 5;
        double rakam = 55.67;
        rakam = sayi;      // otomatik rakam = (double) sayi;
        sayi = (int)rakam;   // manuel

//        sayıyı string'e dönüştürme

        String yazi = Integer.toString(sayi);
        String yazi2 = Double.toString(rakam);

        System.out.println("yazi : " + yazi);
        System.out.println("yazi2 : " + yazi2);


//        soru : short olarak atadığınız değeri string e çevirerek, ekrana yazdırınız.

        short a = 2;
        String kelimeHali = Short.toString(a);

        System.out.println(kelimeHali);

//        ********************************************
//        daha iyi anlamak için;

        short sayi1 = 345;
        String kelimeHali1 = Short.toString(sayi1);

        System.out.println("kelimeHali1 : " + kelimeHali1);

        int sayi2 = 245;                   // sayı değeri taşır matematiksel işleme girer.
        String kelimeHali2 = "245";        // sayı değeri taşımaz sadece sembol.

        int top = 34 + sayi2;
  //      int top2 = 34 + kelimeHali2;    // int top2 = 34 + kelimeHali2;     //  bu şekilde kullanılmaz.










    }
}
