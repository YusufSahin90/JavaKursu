package Gun06;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Kullanıcıdan name, password, gizli soru bilgilerini isteyin ve konsola yazdırın.


        System.out.print("Username: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();
        System.out.print("Gizli soru: ");
        String soru = scanner.nextLine();    // nextLine : satır okuma yapar
                                             // next : kelime okuma yapar

        System.out.println("Username: " + name + " " + "Password: " + pass + " " + "Gizli soru: " + soru);






//        ya da 2. yöntem

     /*   System.out.print("Username: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        int pass = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Gizli soru: ");
        String soru = scanner2.nextLine();

        System.out.println("Username: " + name + " " + "Password: " + pass + " " + "Gizli soru: " + soru);

      */

//        Dipnot olarak   // nextLine : satır okuma yapar
                          // next : kelime okuma yapar

     /*   System.out.print("Username: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();
        System.out.print("Gizli soru: ");
        String soru = scanner.next();      // next olarak girdik.

        System.out.println("Username: " + name + " " + "Password: " + pass + " " + "Gizli soru: " + soru);

      */






    }
}
