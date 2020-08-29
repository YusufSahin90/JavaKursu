package Gun09;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {

        // artırma ve azaltma operatoru

        int a = 5;
        int b = 2;
        int k = 0;

        a++;  // a nın degerini bir artır => a = a + a le aynı  -> 6  // ilk deger  sonra a++ oldugu için 7 arttırıyoruz
        ++a;  // a nın degerini bir artır => a = a + a le aynı  -> 7  // ve 7 oluyor. son degerden islem yapıcaz.

        k = a++;  // ++ lar sagda oldugu için, önce k = a çalışır, sonra a = a + 1 çalışır, sonra a = a + 1; k = 7, a = 8
        k = ++a;  // ++ lar solda oldugu için, önce a = a + 1 çalışır, sonra k = a olur, sonra k = a; a = 9, k = 9
        System.out.println(k);

        a--;  // a nın degerini bir artır => a = a - a le aynı  -> 8  // ilk deger 8 sonra a-- oldugu için 1 azaltıyoruz
        --a;  // a nın degerini bir artır => a = a - a le aynı  -> 7   // ve 7 oluyor. son degerden islem yapıcaz.

        k = a--;  // ++ lar sagda oldugu için, önce k = a çalışır, sonra a = a - 1 çalışır, sonra a = a + 1; k = 7, a = 6
        k = --a;  // ++ lar solda oldugu için, önce a = a - 1 çalışır, sonra k = a olur, sonra k = a; a = 5, k = 5
        System.out.println(k);





    }
}
