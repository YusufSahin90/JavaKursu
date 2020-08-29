package Gun51.JavaPolymorphism.Ornek2;

public class Kisi {

    private String ad;
    private String soyad;
    private String gorev;


    public Kisi(String ad, String soyad, String gorev) {

        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;

    }

    public static void kimlikYaz(Kisi kisi){

        System.out.println("Ad : " + kisi.ad);
        System.out.println("Soyad : " + kisi.soyad);
        System.out.println("Gorev : " + kisi.gorev);

        // 1. Yol
        // kisi Ogrenciden mi oluşturulmuş ?
        if(kisi instanceof Ogrenci){

            System.out.println("Sube : " + ((Ogrenci) kisi).getSube());

        }else if(kisi instanceof Calisan){

            System.out.println("Departman : " + ((Calisan) kisi).getDepartman());
        }

        // 2. Yol

//        if(kisi.getClass().getSimpleName().equalsIgnoreCase("Ogrenci")){
//
//            System.out.println("Subesi : " + ((Ogrenci)kisi).getSube());
//        }
//
//        if(kisi.getClass().getSimpleName().equalsIgnoreCase("Calisan")){
//
//            System.out.println("Departmanı : " + ((Calisan)kisi).getDepartman());
//        }


    }


//    public static void ogrenciBilgileri(Ogrenci ogrenci){
//
//        System.out.println("Ad : " + ogrenci.getAd());
//        System.out.println("Soyad : " + ogrenci.getSoyad());
//        System.out.println("Gorev : " + ogrenci.getGorev());
//        System.out.println("Sube : " + ogrenci.getSube());
//    }
//
//    public static void calisanBilgileri(Calisan calisan){
//
//        System.out.println("Ad : " + calisan.getAd());
//        System.out.println("Soyad : " + calisan.getSoyad());
//        System.out.println("Gorev : " + calisan.getGorev());
//        System.out.println("Departman : " + calisan.getDepartman());
//    }


//    public String getAd() {
//        return ad;
//    }
//
//    public void setAd(String ad) {
//        this.ad = ad;
//    }
//
//    public String getSoyad() {
//        return soyad;
//    }
//
//    public void setSoyad(String soyad) {
//        this.soyad = soyad;
//    }
//
//    public String getGorev() {
//        return gorev;
//    }
//
//    public void setGorev(String gorev) {
//        this.gorev = gorev;
//    }



}

