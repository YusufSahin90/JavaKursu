package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {

        // Kullanıcıdan alacagınız 5 adet meyve ismini bir diziye atadıktan sonra
        // elma ismi geçen meyveleri ekrana ayrı bir döngüde yazdırınız.

        String[] Array = new String[5];

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < Array.length; i++) {
            System.out.print("meyve ismi giriniz: ");
            Array[i] = sc.nextLine();

        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(Array));

        for (int i = 0; i < Array.length; i++) {


            if(Array[i].equalsIgnoreCase("elma")) {  // sadece elma olanlar çıkar.

                System.out.println("Array[i] : " + Array[i]);
            }

                if (Array[i].toLowerCase().contains("elma")) {  // içinde meyve olanları da alır. Örnek: yerelması

                    System.out.println("Array[i] : " + Array[i]);
                }
                }
            }

        }


