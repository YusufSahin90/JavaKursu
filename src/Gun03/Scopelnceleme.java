package Gun03;

public class Scopelnceleme {
    public static void main(String[] args) {

        int a = 5;
        {  // değişkenin geçerlilik sınırı bu parantezlerin arasındadır.
            int b = 7;
            a = 8;


            //  a ve b mevcut
        }

        // sadece a mevcut;
        a = 56;
     //   b = 6;    // bu şekilde kullanamıyoruz çünkü geçerlikik parantezlerinin dışında
     // ancak aynı isimde yeniden tanımlanalarak kullanılabilir istenirse.

        // yeni bir değişken olarak tanımlanabilir.



    }
}
