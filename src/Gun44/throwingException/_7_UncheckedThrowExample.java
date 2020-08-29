package Gun44.throwingException;

import java.util.Scanner;

public class _7_UncheckedThrowExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz:");
        String username = sc.nextLine();

        try{
            if(username.length() < 6) {
                throw new Exception("6 karakterden az olamaz");

                // throw ile kendimiz hata oluşturuyoruz.
                // böylece kriterlerimize girmeyenler için de
                // catch bloguna duşurerek, pratik kullanım saglıyoruz.
            }

            if(username.length() > 10){
                throw new Exception("10 karakterden fazla olamaz");
            }
        }catch (Exception ex){

            System.out.println("ex : " + ex);
        }
    }
}
