package Gun08;

public class StringReplaceFirst {
    public static void main(String[] args) {

        // ReplaceFirst : -> Replace ile aynı sadece ilk bulunanı degistirir.

        String text = "Merhaba Dünya";

        System.out.println("Original hali : " + text );
        System.out.println("butun a ların degistigi hali : " + text.replace("a", "e"));
        System.out.println("ilk bulunan a nın degistigi hali : " + text.replaceFirst("a", "e"));












    }


}
