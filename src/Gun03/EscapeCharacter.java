package Gun03;

public class EscapeCharacter {
    public static void main(String[] args) {


        //  System.out.println();     // imleç noktalı virgülün yanında iken ( ctrl + D ) yaptığında,
                                      //  kopyasını bir alta yazar.
        // Yorum satırı oluşturma kısa yolu :
        // ctrl ile /  tuşuba basılırsa //
        // ctrl+shift   /   tuşuna basılırsa  /*   */  yorum satırı oluşur
        /* System.out.println("Pazartesi");
        System.out.println("Salı");
        System.out.println("Çarşamba");*/

        // alt satıra geçer. (Enter) tuşu etkisi yapar.     \n
        //System.out.println("Pazartesi \n Salı \n Çarşamba");

        // tab tuşu etkisi yapar :      \t
        //System.out.println("Pazartesi \t Salı");
        //System.out.println("\tPazartesi Salı");

        // Çift tırnak koymak için :    \"
        //System.out.println("Java");    //    Java   olarak ekrana yazılır.
        //System.out.println(" \"Java\" ");    //  "Java" olarak ekrana yazılır.

        System.out.println("Java");  //  Java    olarak ekrana yazılır.
        System.out.println("\\ Java");  //  \Java    olarak ekrana yazılır.

    }
}
