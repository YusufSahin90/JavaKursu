package Gun12;


import java.util.Scanner;

public class GununSorusu {
    public static void main(String[] args) {

        // ********** Soru 1 **********

        Scanner sc = new Scanner(System.in);

        System.out.print("x koordinatını giriniz: ");
        int x = sc.nextInt();
        System.out.print("y koordinatını giriniz: ");
        int y = sc.nextInt();

        if ( x < -2 || x > 8 || y > 4 || y < 1)
            System.out.println("Dışında");
        else if (y < 4 && y > 1 && x < 8 && x > -2)
            System.out.println("İçinde");
        else
            System.out.println("Çizgi üstünde");

        // if ( (x == 8 || x == -2) && ( y > 1 || y < 4) )      // sag ve sol kenar
        //   || ((y == 1 || y == 4) && (x > -2 || x < 8))      // üst ve alt çizgi






        // ********** Soru 2 **********

      /*  System.out.print("x koordinatını giriniz: ");
        int x = sc.nextInt();
        System.out.print("y koordinatını giriniz: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0 )
            System.out.println("A bölgesi");

        else if (x < 0 && y > 0)
            System.out.println("B bölgesi");

        else if (x < 0 && y < 0)
            System.out.println("C bölgesi");

        else
            System.out.println("D bölgesi");

       */











    }
}
