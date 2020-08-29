package Gun17;

public class JavaLabeledLoops12 {

    public static void main(String[] args) {

        //  iç içe döngulerde, içteki bir degiskenin degerine göre dış dönguyu kırmak için
        // (continue da olabilir) döngulere isim (etiket yani laber) verilir.
        // ve break veya continue çalıştırılırken bu isim yazılarak istenilen döngu için
        // etki (break ve continue) oluşturulur.


        dis_dongu: for(int i =1; i < 10; i++){

            ic_dongu: for(int j = 1; j < 10; j++){  // dış döngüyü j == 3 iken nasıl kırarım

                if(j == 3)
                    break dis_dongu;

                System.out.println("i: " + i + ", j: " + j);
            }
            // burada j yok, j iç döngude
            System.out.println();
        }
    }
}
