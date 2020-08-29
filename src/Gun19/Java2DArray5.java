package Gun19;

public class Java2DArray5 {
    public static void main(String[] args) {

        // 2 ders ve 3 ögrencinin notlarını kendiniz tanımlarken 2 boyutlu dizide veriniz.
        // Daha sonra ayrı bir döngu ile her bir dersin not ortalamasını bulunuz.

        int[] dizi1 = new int[5];   // 1 boyutlu dizi tanımlaması
        int[] dizi2 = {4, 7, 18, 9, 13};   // 1 boyutlu dizi hem tanımlama hem deger atama

        int[][] mat1 = new int[2][3];  // 2 boyutlu dizi tanımlaması
        int[][] mat2 = {{65, 76, 90}, {80, 66, 95}};   // 2 boyutlu dizi hem tanımlama hem deger atama

        // ekrana yazdırma islemi

        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                System.out.println(mat2[satir][sutun]);
            }
            System.out.println();
        }

        // Butun notların toplamı

        int tumNotlarinToplami = 0;

        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                tumNotlarinToplami += mat2[satir][sutun];
            }

        }

        System.out.println("tumNotlarinToplami : " + tumNotlarinToplami);

        // 1. dersin yani indexe göre 0. dersin not toplamı
        System.out.println();
        int ders1NotToplami = 0;

        for (int sutun = 0; sutun < 3; sutun++) {

            ders1NotToplami += mat2[0][sutun];
        }

        // 2. dersin yani indexe göre 1. dersin not toplamı

        int ders2NotToplami = 0;

        for (int sutun = 0; sutun < 3; sutun++) {

            ders2NotToplami += mat2[1][sutun];
        }
        System.out.println("1. Dersin Ortalaması : " + (ders1NotToplami / 3));
        System.out.println("2. Dersin Ortalaması : " + (ders2NotToplami / 3));
    }
}

