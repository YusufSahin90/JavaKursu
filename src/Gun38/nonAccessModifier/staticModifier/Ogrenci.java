package Gun38.nonAccessModifier.staticModifier;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAd = "Yıldırım";
    // Static kullanım sebebi hafızayı gereksiz tekrarlardan kurtarmak

    public Ogrenci(String ad, String soyad){

        this.ad = ad;
        this.soyad = soyad;
        // this.okulAd = okulAd;
    }

    void print(){

        System.out.println(ad + " " + soyad + " " + okulAd);
    }

}
