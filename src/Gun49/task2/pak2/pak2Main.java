package Gun49.task2.pak2;

import Gun49.task2.pak1.pak1Hayvan;

public class pak2Main {
    public static void main(String[] args) {

        pak1Hayvan hayvan2 = new pak1Hayvan();
        hayvan2.ad = "kopek";   // public oldugundan her yerden ulaşılabiliyor.
        // hayvan2.yas = 8;   // default olunca sadece kendi paketinden ulaşılabilir.
        // farklı paketten ulaşılamaz.
        // hayvan2.cinsi = "van";  //  default gibi çalışıyor normal class larda
        // sadece kendi paketinden ulaşılabilir.
        // hayvan2.renk = "beyaz";  // bu filed private oldugundan sadece kendi class ının içinden ulaşılabilir.

        pak2Kedi kedi = new pak2Kedi("kopuk", "tekir");

        kedi.BilgiYaz();
        // kedi.cinsi;  // sadece subclass dan ulaşılabiliyor.
    }
}
