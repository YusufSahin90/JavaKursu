package Gun16;

import java.util.Scanner;

public class ForLoop5 {

    public static void main(String[] args) {

        // 2 ler çarpım tablosunu, tablo olarak yazdırınız.
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 4 = 8
        // 2 x 5 = 10
        // 2 x 6 = 12
        // 2 x 7 = 14
        // 2 x 8 = 16
        // 2 x 9 = 18
        // 2 x 10 = 20

        Scanner sc = new Scanner(System.in);


        for(int i = 1; i <= 10; i++){

            int carpım = i * 2;

            System.out.println("2 x " + i + " = " + carpım);


        }
    }
}
