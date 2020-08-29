package Gun39.javaEnum.Ex3;

import java.util.ArrayList;

public class Ex3Main {
    public static void main(String[] args) {


        Kitap kit1 = new Kitap();
        kit1.name = "Sefiller";
        kit1.kategori = KitapKategori.ROMAN;

        Kitap kit2 = new Kitap();
        kit2.name = "Beyaz Zambaklar";
        kit2.kategori = KitapKategori.ROMAN;

        ArrayList<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);

        for (Kitap k :kitaplar){

            if (k.kategori == KitapKategori.ROMAN) {

                System.out.println("k.name = " + k.name);
            }
        }
    }
}
