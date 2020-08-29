package Gun44.uncheckedAndCheckedExceptions;

public class _4_JavaUnchecked {
    public static void main(String[] args) {

        // hata olsa bile try catch zorunlu tutulmuyorsa
        // bunlara UnChecked Exception deniyor.

        int a = 5;
        int b = 0;

        System.out.println("a / b = " + a / b);
    }
}
// RuntimeException işlemleri UnChecked
