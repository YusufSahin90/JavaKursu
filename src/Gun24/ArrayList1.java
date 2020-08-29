package Gun24;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // Array : boyut sayısının belli oldugu ve degerlerin çok sık degistirilmedigi durumlarda

        int[] dizi = new int[5];   //  Array : daha sonradan boyutu degiştirilemiyor.

        // ArrayList : boyutu dinamik yani degisken ve degerlerin hızlı degismesi durumunda daha hızlı

        ArrayList<Integer> integerliste = new ArrayList<Integer>();  // tanımlama
        ArrayList<Boolean> booleanliste = new ArrayList<Boolean>();
        ArrayList<String> stringliste = new ArrayList<>();   // <> arası boş bırakılabilir

        // String ArrayList tanımlanması

        ArrayList<String> isimler = new ArrayList<>();

        // Eleman ekleme

        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("1 isimler : " + isimler);

        // belli bir indexe eleman ekleme, eklendigi indexten sonrakiler bir aşagı kayar

        isimler.add(1, "Zeynep");
        System.out.println("2 isimler : " + isimler);

        // 2 nolu indexteki elemanı verir.

        String elemanAtIndex2 = isimler.get(2);
        System.out.println("2 nolu index teki eleman : " + elemanAtIndex2);

        // 0 indexteki elemanın degerini degistir.

        isimler.set(0, "Deniz");
        System.out.println("3 isimler : " + isimler);

        // Eleman sayısını verir, Array daki length

        int elemanSayisi = isimler.size();
        System.out.println("elemanSayisi : " + elemanSayisi);

        // Listenin tamamen boş olup olmadıgını verir.

        boolean listeBosMu = isimler.isEmpty();
        System.out.println("listeBosMu : " + listeBosMu);

        // Eleman silme

        isimler.remove("Ayşe");
        System.out.println("4 isimler : " + isimler);

        isimler.remove(1);
        System.out.println("5 isimler : " + isimler);

        // Bir elemanın indexini bulma

        int indexOfKaya = isimler.indexOf("Kaya");
        System.out.println("indexOfKaya : " + indexOfKaya);

        // Tum elemanları boşaltma

        isimler.clear();
        System.out.println("6 isimler : " + isimler);
    }

}

