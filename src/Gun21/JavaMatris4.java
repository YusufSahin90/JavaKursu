package Gun21;

public class JavaMatris4 {
    public static void main(String[] args) {

/*
       // String 2D array oluştur

      // {{"$12" , "$22" , "0$"}, {"€9" , "€40" , "$1"}, {"€12","€2","€0"}}

     //  String de $ varsa 3.2 ile çarp

     //  String de € varsa 4.2 ile çarp

     //  double return et

    */

        String[][] matris = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double toplam = 0;

        for (int satir = 0; satir < 3; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                if (matris[satir][sutun].contains("$")) {    //  $ içeriyorsa

                    toplam = toplam + Integer.parseInt(matris[satir][sutun].replace("$", "")) * 3.2;

                } else if (matris[satir][sutun].contains("€")) {    //  € içeriyorsa

                    toplam = toplam + Integer.parseInt(matris[satir][sutun].replace("€", "")) * 4.2;
                }

            }
        }
        System.out.println("toplam : " + toplam);



    }
}
