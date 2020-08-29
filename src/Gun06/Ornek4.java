package Gun06;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Ülke, Kilo, Boy bilgilerini alın ve konsola yazdırın.

        System.out.print("Ülkenizi giriniz : ");
        String ulke = scanner.nextLine();
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz (Örnek: 1,75) : ");
        double boy = scanner.nextDouble();

        System.out.println("Ülkeniz : " + ulke + " " + "Kilonuz : " + kilo + " " + "Boyunuz : " + boy);

    }
}
