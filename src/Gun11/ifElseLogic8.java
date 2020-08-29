package Gun11;

import java.util.Scanner;

public class ifElseLogic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("**********************************");
        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.println("***********************************");
        System.out.print("Lütfen işlem seçiniz: ");
        String islem = sc.nextLine();

        System.out.print("birinci sayıyı giriniz: ");
        int birincisayı = sc.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int ikincisayı = sc.nextInt();

        if (islem.equalsIgnoreCase("T"))
            System.out.println((birincisayı + ikincisayı));
        else if (islem.equalsIgnoreCase("Ç"))
            System.out.println((birincisayı - ikincisayı));
        else if (islem.equalsIgnoreCase("P"))
            System.out.println((birincisayı * ikincisayı));
        else if (islem.equalsIgnoreCase("B"))
            System.out.println((birincisayı / ikincisayı));

    }
}
