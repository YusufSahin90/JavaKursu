package Gun07;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        //  2 string buyuk kucuk karakter ayırımı yapmadan karsılastırır.

        String str = "Merhaba";

        System.out.println("Esit mi = " + str.equalsIgnoreCase("mERHaba"));

        System.out.println("Esit mi = " + str.equalsIgnoreCase("mERHa"));

        boolean esitmi = str.equalsIgnoreCase("mERHaba");  // boolean degiskenine atanabilir, kontrol sonucu













    }
}
