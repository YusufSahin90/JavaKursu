package Gun44.throwingException;

import java.util.Scanner;

public class _6_UncheckedThrowExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz: ");
        String username = sc.nextLine();

        if(username.length() < 6){
            System.out.println("Kullanıcı adı 6 karakterden az olamaz");
        }
        if (username.length() > 10){
            System.out.println("Kullanıcı adı 10 karakterden buyuk olamaz.");
        }
    }
}
