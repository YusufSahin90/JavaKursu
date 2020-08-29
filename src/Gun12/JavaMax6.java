package Gun12;

import java.util.Scanner;

public class JavaMax6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayı: ");
        int sayı1 = sc.nextInt();
        System.out.print("2. sayı: ");
        int sayı2 = sc.nextInt();
        System.out.print("3. sayı: ");
        int sayı3 = sc.nextInt();

        System.out.println("Maksimum sayı : " + Math.max(sayı1, Math.max(sayı2,sayı3)));
        System.out.println("Minimum sayı : " + Math.min(sayı1, Math.min(sayı2,sayı3)));
    }

}

