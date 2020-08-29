package Gun14;

import java.util.Scanner;

public class doWhile9 {
    public static void main(String[] args) {

        // kullanıcıda x harfi girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiginde ise "program bitti" yazan programı yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("bir işlem giriniz: ");
        String islem = sc.nextLine();

        String str;

        do{
            System.out.println("Program çalışıyor");
            str = sc.nextLine();

        } while(!str.equalsIgnoreCase("x"));
             System.out.println("Program bitti");

        }







    }









