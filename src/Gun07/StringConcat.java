package Gun07;

public class StringConcat {
    public static void main(String[] args) {

//        bir stringe diğerini ekler

        String s = "hi";
        System.out.println(s + " there!");        // Hi there!
        System.out.println(s.concat(" there!"));  // Hi there!

        String s2 = " everybody";
        System.out.println(s.concat(s2));
        System.out.println("s = " + s);

        s = s.concat(s2);                // değişkenin kendine atarsam değeri değişir, üstteki örneklerde atanmadı.
        System.out.println("s = " + s);








    }
}
