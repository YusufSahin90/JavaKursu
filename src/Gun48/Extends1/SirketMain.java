package Gun48.Extends1;

public class SirketMain {
    public static void main(String[] args) {

        Yonetici2 mudur = new Yonetici2();

        // personelin her fieldini kullanabilir ve erişim izni olunca

        mudur.maas = 3000;
        mudur.departman = "destek birimi";

        // hem kendi hem de personelin metodlarını kullanabiliyor.
        // erişim izni olunca

        mudur.getMaas();
        mudur.zamYap(10);


    }
}
