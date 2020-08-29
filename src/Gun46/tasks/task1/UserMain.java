package Gun46.tasks.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

       int miktar = 0;
       Scanner sc = new Scanner(System.in);
       boolean usernameIste = true;
       String username = "";
       String password = "";

       do {

           if (usernameIste) {


           System.out.println((miktar + 1) + ".User Name : ");
           username = sc.nextLine();
       }

           System.out.println("Password : ");
           password = sc.nextLine();

           try{
               User yeniUser = new User(username,password);
               miktar++;
               usernameIste = true;  // hata olmadıgında bir sonraki kullanıcı icin username istenecek.


           }catch(Exception ex){

               System.out.println(ex.getMessage());
               usernameIste = false;  // hata oldugu durumda tekrar usernama istenecek.
           }
       }while(miktar < 6);
    }
}

