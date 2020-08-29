package Gun23;

public class JavaMethods6 {
    public static void main(String[] args) {

        ortalamaBulYaz("Ali", 60, 80, 85, 95, 100, 60);
        ortalamaBulYaz("Mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("Ayşe", 65, 70, 75);
        ortalamaBulYaz("Ömer", 60, 80, 85, 95, 60);
    }

    // ... ile ilgili 2 kural var
    // Kural 1- Bir metodda parametre olarak sadece 1 tane olabilir
    // Kural 2- Her zaman en sonda olmalı

    public static void ortalamaBulYaz(String isim, int... notlar){

        double toplam = 0;

        for(int not : notlar){

            toplam = toplam + not;
        }
        System.out.println(isim + " " + toplam / notlar.length);

        // return = gelen sonucu kullanacagimiz zaman kullaniyoruz
        //burda gelen sonuc yok bu yuzden kullanmadik...return kullanmadigimiz icin void yazili kaldi
    }
}
