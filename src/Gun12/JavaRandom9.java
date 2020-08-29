package Gun12;

import java.util.Scanner;

public class JavaRandom9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("alt deger: ");
        int min = sc.nextInt();
        System.out.print("ust deger: ");
        int max = sc.nextInt();

        int numberInRange = (int) (Math.random()*((max - min) + 1)) + min;

        // 3 7 arası uretmek istersek
        // max deger için bu : 0,1 * 5 => 0,5 + 3 = min 3
        // max deger için bu : 0,99 * 5 => 4,95 + 3 = max 7

        System.out.println("numberInRange: " + numberInRange);










    }
}
