package Gun08;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol edin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz : ");
        String text = scanner.nextLine();

        boolean boslukvarmı = text.contains(" ");
        System.out.println("boslukvarmı : " + boslukvarmı);

        // Kullanıcıdan alacagını bir stringin boş olup olmadıgını kontrol ediniz.

        boolean bosmu = text.isEmpty();
        System.out.println("bosmu : " + bosmu);









    }
}
