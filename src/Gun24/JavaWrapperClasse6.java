package Gun24;

public class JavaWrapperClasse6 {
    public static void main(String[] args) {

        // program sadece rakam veya harf gibi veya true false gibi,
        // basit degerler saklayacaksa hafızada çok yer kaplamasın diye
        // aynı tiplerin basit yani primitive tiplerini oluşturalım.
        // eger bu degerden fazlası gerekecekse o zaman bunların ilk harfi buyuk
        // halleri olan tipleri kullanılsın.

        int a = 5;
        String strInt = String.valueOf(a);   // bu ise basit sadece bir sayı

        Integer b = 6;
        String strInteger = b.toString();   // yani bu tipin içinde gerekli çokça metod var
        // içinde çokça metod olan tiplere Wrapper Class deniyor.
        // wrapper kaplamak demek methodları kapladık içinde çok method var.

        b = a;   // boxing denir, basit olan tipin, kapsamlı tipe atanmasına denir.
        a = b;   // unboxing denir, yani kapsamlı tipin, basite atanmasına.

        double c = 3.4;
        Double d = 5.6;

        char e = 'F';
        Character f = 'Y';

        boolean g = true;
        Boolean h = false;

        float k = 3.4f;
        Float l = 5.6f;

    }
}
