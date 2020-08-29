package Gun05;

public class Ornek2 {
    public static void main(String[] args) {

     /*   double a = 5.56;
        double b = 2.256;
        short c = 2;
        short d = 6;

        System.out.println((short) a);
        System.out.println( (short) b);
        System.out.println( (double) c);
        System.out.println( (double) d);  */


//        ya da şöyle yapabiliriz. ***************************************************

        double oran = 40000.4567;    // short a çevirirken, shortun çevirebileceği sayıyı aşarsa, sonuç farklı yada - olarak çıkıyor.
        short ornekleme;

        ornekleme = (short) oran;
        System.out.println("ornekleme = " + ornekleme);







    }
}
