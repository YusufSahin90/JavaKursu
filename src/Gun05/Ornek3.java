package Gun05;

public class Ornek3 {
    public static void main(String[] args) {
//        short ve byte cinsinden 2 değer tanımlayınız, değer atayınız.
//        short u byte türüne çeviriniz.

        short a = 126;
        short c = 129;


        System.out.println("Dönüştürülmüş değer : " +  (byte) a);
        System.out.println("Dönüştürülmüş değer : " + (byte) c);

//        ya da ***************************************

        short sayi1 = 126;
        short sayi2 = 200;

        byte sayi3 = (byte)sayi1;
        byte sayi4 = (byte)sayi2;

        System.out.println("sayi3 " + sayi3);
        System.out.println("sayi4 " + sayi4);






    }
}
