package Gun04;

public class JavaString {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünyalılar");

        String ad = "ismet";
        String soyad = "Temur";

        System.out.println(ad + " " + soyad);   //  çift tırnak arasında yazılmayan her şey değişken kabul edilir ve değeri yazılır.
        System.out.println("ad " + "soyad");

        String fullName = ad + " " + soyad;
        System.out.println("fullName = " + fullName);

        int yas = 45;
        String bilgi = ad + " " + soyad + " " + yas;
        System.out.println(bilgi);





    }
}
