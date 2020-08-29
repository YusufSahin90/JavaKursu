package Gun21;

public class JavaMatris2 {
    public static void main(String[] args) {

        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int[][] array = {  {1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}  };


        int max = 0;      // buraya int max = mat[0][0];  da diyebiliriz 2. yöntem olarak.
        for (int satir = 0; satir < 4; satir++) {    // mat.length => satır sayısını verir yani 4

            for (int sutun = 0; sutun < 3; sutun++) {   // 3 un yerine mat[satir].length satırı temsil ediyor.


                if (array[satir][sutun] > max) {
                    max = array[satir][sutun];
                }
            }
        }
        System.out.println("max : " + max);

        // -------------------------    eger sayılar -1,-2 vs. gibi olursa max deger bulalım   --------------------------------------------

        int[][] array2 = {  {-1, -2, -3}, {-2, -3, -1}, {-5, -5, -5}, {-2, -10, -3}  };

        int max2 = array2[0][0];

        for (int satir = 0; satir < 4; satir++) {    // mat.length => satır sayısını verir yani 4

            for (int sutun = 0; sutun < 3; sutun++) {   // 3 un yerine mat[satir].length satırı temsil ediyor.


                if (array2[satir][sutun] > max2) {
                    max2 = array2[satir][sutun];
                }
            }
        }
        System.out.println("max : " + max2);




    }
}
