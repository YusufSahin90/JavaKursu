package Gun21;

public class JavaMatris6 {
    public static void main(String[] args) {

        // Düzensiz 2 boyutlu diziler.

        int[][] duzensiz2d = {
                {0, 1, 2},
                {3, 4},
                {5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};  // boş olan yerlere eleman atanamaz tanımlama sonrasında hata verir.

        System.out.println("0. satırdaki sutun sayısı : " + duzensiz2d[0].length);
        System.out.println("1. satırdaki sutun sayısı : " + duzensiz2d[1].length);
        System.out.println("2. satırdaki sutun sayısı : " + duzensiz2d[2].length);
        System.out.println("3. satırdaki sutun sayısı : " + duzensiz2d[3].length);

        for (int satir = 0; satir < duzensiz2d.length; satir++) {

            for (int sutun = 0; sutun < duzensiz2d[satir].length; sutun++) {

                System.out.print(duzensiz2d[satir][sutun] + " ");
            }
            System.out.println();


        }
    }
}
