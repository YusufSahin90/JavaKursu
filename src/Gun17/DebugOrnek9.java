package Gun17;

public class DebugOrnek9 {

    public static void main(String[] args) {

        // Programı adım adım çalıştırıp her satırdaki degerleri kontrol etmek
        // için başlaması istedigimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılır. Program ilk olarak breakpoint de
        // durur ve F8 ile adım adım ilerletilir. Bu şekilde hem degerler izlenir
        // hemde nasıl çalıştıgı test edilebilir.

        int a = 10;

        a = 1000;

        a+= 100;   // a = a + 100;

        a*= 10;    // a = a * 10;

        System.out.println("a : " + a);


    }
}
