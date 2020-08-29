package Gun11;

import java.util.Scanner;

public class ifElseLogic5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // girilen bir stringin içerisinde uzunlugu 10 dan buyukse ve string içinde
        // "study" kelimesi geciyorsa ekrana evet yazdırın degilse hayır yazdırınız.

        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime = sc.nextLine();

        if (kelime.length() > 10 && kelime.contains("study")) {
            System.out.println("evet");
        }else {
            System.out.println("hayır");
        }






    }
}
