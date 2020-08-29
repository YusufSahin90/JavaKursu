package Gun07;

public class StringIndexOf {
    public static void main(String[] args) {

        // verilen karakter(ler) in string icerisindeki baslangıc indexini verir.
        // contains den farkı indexini verir. contains ise true ve false verir.

        String text = "Good";

        System.out.println("G harfinin indexi =" + text.indexOf("G"));

        System.out.println("d harfinin indexi =" + text.indexOf("d"));

        System.out.println("H harfinin indexi =" + text.indexOf("H"));  //  -1 bulunamadı demek.

        System.out.println("od nin indexi =" + text.indexOf("od"));     // var ise ilk harfin indexini verir.

        int index = text.indexOf("o");   // int degiskene atanabilir.

        System.out.println("index =" + index);    // birdan fazla var ise ilkini verir.











    }
}
