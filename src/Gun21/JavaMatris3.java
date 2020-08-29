package Gun21;

public class JavaMatris3 {
    public static void main(String[] args) {

         /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden min. number print et

     */


        int[][] matris = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        System.out.println("matris.length : " + matris.length);       // satır sayısı
        System.out.println("matris[0].length : " + matris[0].length);  // 0. satırdaki sutun sayısını verdi
        System.out.println("matris[1].length : " + matris[1].length);  // 1. satırdaki sutun sayısını verdi
        System.out.println("matris[2].length : " + matris[2].length);   // 2. satırdaki sutun sayısını verdi
        System.out.println("matris[3].length : " + matris[3].length);   // 3. satırdaki sutun sayısını verdi

        int min = matris[0][0];   // ilk eleman yani 1

        for(int satir = 0; satir < matris.length; satir++){

            for (int sutun = 0; sutun < matris[satir].length; sutun++){

                if(matris[satir][sutun] < min){
                    min = matris[satir][sutun];
                }
            }
        }
        System.out.println("min : " + min);




    }
}
