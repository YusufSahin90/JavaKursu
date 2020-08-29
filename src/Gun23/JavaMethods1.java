package Gun23;

public class JavaMethods1 {
    public static void main(String[] args) {

        System.out.println("Merhaba Dunya 1");
        System.out.println("Merhaba Dunya 2");

        merhabaYaz();

        int enb = Math.max(3, 4);  // 2 sayıdan en buyugunu bulup

        int enbTurkce = enBuyukBul(3, 4);

        String adsoyad = AdSoyadBirlestir("Ali","Demir");
        System.out.println("adsoyad : " + adsoyad);
        // burada birleşmiş haline ulaşabiliyormuyum şu anda, return yaptıgımda geri alabildim.
    }

    public static String AdSoyadBirlestir(String ad, String soyad){

        return ad + " " + soyad;
        // System.out.println(ad + " " + soyad);
    }
    public static int enBuyukBul(int a, int b) {

        if (a > b)
            return a; // returnun görevi bu fonksiyonu çagıran yere degeri göndermek
        else
            return b;

        // return Math.max(a,b);
    }
    public static void merhabaYaz() {

        System.out.println("Merhaba Dunya");
    }

}

