package Gun07;

public class StringLength {
    public static void main(String[] args) {

//        string olarak yazdığımı cümlenin karakter sayısını verir.

        String cumle = "Bu gün hava yağmurlu";    // bütün karakterlerin adedi (boşluklarda karakterdir.)

        int uzunluk = cumle.length();

        System.out.println("uzunluk = " + uzunluk);

//        ya da şu şekilde de yapabiliriz.

        System.out.println("uzunluk = " + cumle.length());



    }
}
