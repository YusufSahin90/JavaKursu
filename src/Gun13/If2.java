package Gun13;

import jdk.nashorn.api.tree.RegExpLiteralTree;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan:  fizik 90 şeklinde not bilgisini alınız.
        // > 90 için A,
        // > 80 için B
        // 70 için C
        // 60 için D


        System.out.println("Notunuzu giriniz: ");
        String not = sc.nextLine();

        // ******     1. Yöntem     ******
     /*   int bosluk = not.indexOf(" ");
        String not2 = not.substring(bosluk +1);
        int not3 = Integer.parseInt(not2);

      */

        // ******     2. Yöntem replaceall ile     ******

        not = not.replaceAll("[^0-9]", "");
        int not3 = Integer.parseInt(not);


        if(not3 >= 90)
            System.out.println("A");
        else if ( not3 >= 80)
            System.out.println("B");
        else if ( not3 >= 70)
            System.out.println("C");
        else if ( not3 >= 60)
            System.out.println("D");
        else if ( not3 >= 40)
            System.out.println("E");
        else
            System.out.println("F");



    }
}
