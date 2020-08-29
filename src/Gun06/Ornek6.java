package Gun06;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Kullanıcıdan sokak, cadde, posta kodu, ülke bilgilerini isteyin ve konsola yazdırın.


        System.out.print("Sokak ismini giriniz : ");
        String sokak = scanner.nextLine();
        System.out.print("Cadde ismini giriniz : ");
        String cadde = scanner.nextLine();
        System.out.print("Posta kodunu giriniz : ");
        int posta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ülke ismini giriniz : ");
        String ulke = scanner.nextLine();

        System.out.println("Sokak ismi : " + sokak + " " + "Cadde ismi : " + " " + "Posta kodu : " + posta + " " + "Ülke : " + ulke);

//        Okuma işleminde klavyeden sadece girilen bili değil enter ve diğer gözükmeyen
//        karakterler de gittiğinden sonraki gelen okuma isteği görünmez karakterle
//        dolabiliyor. Bu sebeple veri girilmiş gibi kabul ediyor. Bunu çözmenin yolu ya araya
//        ek bir gereksin okuma komutu eklemek veya tip değiştiğinde yeni bir scanner
//        değişkeni taımlamaktır.



        // ya da şöyle yapabiliriz ****************************************

     /*   System.out.print("Sokak ismini giriniz : ");
        String sokak = scanner.nextLine();
        System.out.print("Cadde ismini giriniz : ");
        String cadde = scanner.nextLine();
        System.out.print("Posta kodunu giriniz : ");
        int posta = scanner.nextInt();
        scanner.nextLine();                            // araya bir (dummy) kod yazarız.
        System.out.print("Ülke ismini giriniz : ");
        String ulke = scanner.nextLine();

        System.out.println("Sokak ismi : " + sokak + " " + "Cadde ismi : " + " " + "Posta kodu : " + posta + " " + "Ülke : " + ulke);
       */


     /*   System.out.print("Sokak ismini giriniz : ");
        String sokak = scanner.nextLine();
        System.out.print("Cadde ismini giriniz : ");
        String cadde = scanner.nextLine();
        System.out.print("Posta kodunu giriniz : ");
        int posta = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);       // ya da scanner2 adında 2. bir Scanner tanımlayabiliriz.
        System.out.print("Ülke ismini giriniz : ");
        String ulke = scanner2.nextLine();

        System.out.println("Sokak ismi : " + sokak + " " + "Cadde ismi : " + " " + "Posta kodu : " + posta + " " + "Ülke : " + ulke);

      */

    }
}
