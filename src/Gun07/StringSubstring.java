package Gun07;

public class StringSubstring {
    public static void main(String[] args) {

        // Substring : stringin belli bir bolumunu alma islemi
        //            0123456
        String text ="Merhaba arkadaşlar";
        int bosluk = text.indexOf(" ");


        System.out.println("1.bolum = " + text.substring(1,5));     //  1 nolu indexten 5 e kadar 5 dahil degil.
        System.out.println("2.bolum = " + text.substring(0,3));
        System.out.println("3.bolum = " + text.substring(4));       // verilen indexten itibaren sonuna kadar alır.
        System.out.println("4.bolum = " + text.substring(0,bosluk));  // ilk bastan bosluga kadar olan harfleri alır.
        System.out.println("5.bolum = " + text.substring(bosluk));   // bosluk tan sona kadar olan harfleri alır.















    }
}
