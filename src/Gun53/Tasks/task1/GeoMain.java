package Gun53.Tasks.task1;

public class GeoMain {
    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen();

        System.out.println("DD.alan = " + dd.alani(4,5));
        System.out.println("DD.cevre = " + dd.cevresi(4,5));

        Cember cem = new Cember();

        System.out.println("cember alan = " + cem.alani(5));
        System.out.println("cember cevre = " + cem.cevresi(5));

        Kare kare = new Kare();

        System.out.println("kare alan = " + kare.alani(4,4));
        System.out.println("kare cevre = " + kare.cevresi(4));

    }
}
