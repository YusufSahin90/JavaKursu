package Gun08;

public class StringTrim {
    public static void main(String[] args) {

        // trim : stringin başında ve sonunda olan boşluk karakterlerini temizler.

        String text = "  Merhaba Dünya  ";

        System.out.println("Original hali:" + text);
        System.out.println("text:" + text.trim());
        System.out.println("baş ve sondaki boşlukların temizlenmiş hali : ->" + text.trim() + "<-");







    }
}