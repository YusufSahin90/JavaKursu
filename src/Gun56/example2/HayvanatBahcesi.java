package Gun56.example2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args){



        Kedi kedi = new Kedi();
//        kedi.setId();
        kedi.setName("kopuk");
        kedi.setVahsi(false);
        kedi.setDogumTarihi(LocalDate.of(2018,1,5));
        System.out.println(kedi);
        kedi.yiyecegi();
        kedi.yemeMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();

        System.out.println();

        Kartal kartal = new Kartal();
//        kartal.setId();
        kartal.setName("kartal");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(LocalDate.of(2012,12,12));
        System.out.println(kartal);
        kartal.yiyecegi();
        kartal.yemeMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();

        System.out.println();

        Kartal kartal2 = new Kartal();
//        kartal2.setId();
        kartal2.setName("kartal2");
        kartal2.setVahsi(true);
        kartal2.setDogumTarihi(LocalDate.of(2012,12,12));
        System.out.println(kartal2);
        kartal2.yiyecegi();
        kartal2.yemeMiktari();
        kartal2.gunlukUykuSuresi();
        kartal2.sesi();

        System.out.println("Hayvan sayısı: " + Hayvan.sayac);
        System.out.println("Kedi sayısı: " + Kedi.sayac);
        System.out.println("Kartal sayısı: " + Kartal.sayac);



    }
}
