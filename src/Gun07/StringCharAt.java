package Gun07;

public class StringCharAt {
    public static void main(String[] args) {

        //  istenen noktadaki harfi verir,
        //  karakterlerin sırası 0 dan başlar buna index denir.
                    //   0123456789012
        String kelime = "Merhaba Dünya";

        char harf = kelime.charAt(3);

        System.out.println("3.harf = " + harf);

        char harf1 = kelime.charAt(0);
        System.out.println("1.harf = " + harf1);
    }
}
