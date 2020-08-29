package Gun08;

public class StringEndsWith {
    public static void main(String[] args) {

        // endWith : ... ile bitiyor mu

        String text = "Merhaba Dünya";
        int ilkisim = text.indexOf(0);

        System.out.println("ya ile bitiyor mu ? : " + text.endsWith("ya"));
        System.out.println("a ile bitiyor mu ? : " + text.endsWith("a"));
        System.out.println("A ile bitiyor mu ? : " + text.endsWith("A"));
        System.out.println("ba ile bitiyor mu ? : " + text.endsWith("ba"));









    }
}
