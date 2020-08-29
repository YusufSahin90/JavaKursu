package Gun48.Extends1;

public class Yonetici2 extends Personel {

    int bagliPersonelSayisi;
    double gorevTazminati;

    public void zamYap(int yuzde){

        System.out.println(yuzde + " personele zam yapildi.");

    }
}

    // yonetici class da hepsini tek tek yaptik ama yonetici2 class ta
    // miras yontemi ile daha kolay bir yontem oldu
    // yoneticide bir personel oldugu için sadece yoneticiye
    // eklenecekleri ekledik. personel de yoneticinin kullanmayacagi bir degisken tanimlamak
    // inheritance yontemine engel degi.