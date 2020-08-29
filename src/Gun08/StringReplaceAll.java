package Gun08;

public class StringReplaceAll {
    public static void main(String[] args) {

        // ReplaceAll : replace gibi çalışır, farkı kritere göre degistirir.

        String text = "Merhaba Dünya";

        System.out.println("Original hali : " + text);
        System.out.println("a,b,n leri, _ yapılmıs hali : " + text.replaceAll("[abn]", "_"));
        System.out.println("Buyuk harfleri * yapılmıs hali : " + text.replaceAll("[A-Z]", "_"));  // A'dan Z'ye kadar olan harfleri _ yapar.
        System.out.println("Buyuk harfleri * yapılmıs hali : " + text.replaceAll("[A-D]", "*"));  // A'dan D'ye kadar olan harfleri * yapar.







    }
}
