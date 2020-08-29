package Gun08;

public class StringReplace {
    public static void main(String[] args) {

        /* Replace : bir stringin içerisindeki istenen karakter(leri)n hepsini,
           verilen yenisi ile değiştirir.

         */


        String text = "Merhaba Dünya";

        System.out.println("Original hali : " +text);
        System.out.println("a ların e olarak degistirilmis hali : " + text.replace("a","e"));
        System.out.println("ba -> de hali : " + text.replace("ba","de"));
        System.out.println("Dünya-> Java degistirilmiş hali : " + text.replace("Dünya","Java"));







    }
}
