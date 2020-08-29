package Gun13;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // kullanıcının girdigi gun sayısına karşılık gelen gun adını yazınız.
        // 1. gün pazartesi olsun

        System.out.print("Gün sayısı giriniz: ");
        int sayı = sc.nextInt();

        switch (sayı) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız...");


        }
    }
}

