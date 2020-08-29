package Gun06;


import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ad ve soyad bilgilerini alıp konsola yazdırınız.


        System.out.print("Adınızı giriniz : ");
        String ad = scanner.nextLine();
        System.out.print("Soyadınızı giriniz : ");
        String soyad = scanner.nextLine();
        System.out.println("Adınız : " + ad + "\n" + "Soyadınız : " + soyad);






    }
}
