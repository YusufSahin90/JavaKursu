package Gun33.Example.Example;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {


        // Benim butun programlarında kullanacagım tip donusumleri için metodlara ihtiyacım var
        // mesela int to String, String to int, vs. vs.. bunları yapan bir sınıf yazınız.
        // ve bunları main de kullanarak gösteriniz.

        // 1. yöntem tip donuşumu için javanın direk komutları

        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        // 2. yöntem tip donuşumu için kendi sınıfımı yazdım onu kullanacagım

        // Utilitiy uti = new Utility();
        // strRakam = util.getString(sayi);
        // intRakam = util.getInt(strRakam);

        // 3. yöntem
        // yeniden oluşturmadıgımız sınıfın direk adı ile kullanıyoruz.

        strRakam = Utility.getString(sayi);
        intRakam = Utility.getInt(strRakam);

        // Aynı Math sınıfı gibi
        Math.random();


    }
}
