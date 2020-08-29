package Gun07;

public class StringLastIndexOf {
    public static void main(String[] args) {

        //  string icinde aranan karakter(ler)in sondan itibaren ilk indexini verir.
        //  indexOf un sondan olan hali fakat index numaraları degismez.

        String text = "Good";
        System.out.println("En sondaki o nun indexi = " + text.lastIndexOf("o"));
        System.out.println("İlk baştan o nun indexi = " + text.indexOf("o"));

        String text2 = "Merhaba Arkadaşlar";
        System.out.println("En sondaki a nın indexi = " + text2.lastIndexOf("a"));
        System.out.println("İlk baştan a nın indexi = " + text2.indexOf("a"));









    }
}
