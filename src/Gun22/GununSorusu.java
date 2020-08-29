package Gun22;

public class GununSorusu {
    public static void main(String[] args) {

      /*

       Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
                       çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklinde yazdırınız.

       */

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        System.out.println("1. matris = ");
        for (int satir = 0; satir < 3; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                array1[satir][sutun] = (int) (Math.random() * 10) + 1;

                System.out.print(array1[satir][sutun] + " ");
            }
            System.out.println();

        }
        System.out.println("2. matris = ");

        for (int satir = 0; satir < 3; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                array2[satir][sutun] = (int) (Math.random() * 10) + 1;

                System.out.print(array2[satir][sutun] + " ");
            }
            System.out.println();
        }
        System.out.println("Sonuc matrisi = ");

        for (int satir = 0; satir < 3; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                int matris1 = array1[satir][sutun];
                int matris2 = array2[satir][sutun];
                int sonucmatrisi = matris1 * matris2;

//                System.out.print(matris1 + matris2 + sonucmatrisi);
//                System.out.print("matris1: " + matris1 + " ");
//                System.out.print("matris2: " + matris2 + " " );
//                System.out.print(sonucmatrisi + " ");
                System.out.print(sonucmatrisi + " ");

            }
            System.out.println();

        }


    }
}

