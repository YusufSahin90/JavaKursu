package Gun16;

import java.util.Scanner;

public class JavaContinueStatement7 {

    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşluk veya a harfi geldiginde bunları yazmasın.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle giriniz : ");
        String cumle = sc.nextLine();

        for(int i = 0; i < cumle.length(); i++){

            if(cumle.charAt(i) == 'a' || cumle.charAt(i) == ' ')
                continue; // continue çalıştıgı anda arıtşa direk gider,
                          //  yani döngunun devamı bu adım çalışmaz. (atla ve devam et).

            System.out.println(cumle.charAt(i));
        }



    }
}
