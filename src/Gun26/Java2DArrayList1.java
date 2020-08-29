package Gun26;

import java.util.ArrayList;

public class Java2DArrayList1 {
    public static void main(String[] args) {

        // todo/**********************************************************************/

        int sayi = 5;                         // tek bir rakam saklayabilen degisken
        int[] dizi = new int[5];              // 5 adet rakam saklayabilen degisken.
        int[][] mat2 = new int[5][5];         //  5x5 => 25 adet rakam
        ArrayList<Integer> arrList = new ArrayList<Integer>();   // istenildigi kadar degisken eklenebilir.

        ArrayList<ArrayList<Integer>> notlarArrList = new ArrayList<>();
        // bosluklar gereksinimi sade gozukebilsin diye yapıldı.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();

        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar);   // burada tanımlamada neyin listesi ise ona uygun degiskeni ekledik.
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);


        // get i nin j si  =>   i bana defterdeki yaprak,  j de yapraktaki not verir.

        System.out.println("notlarArrList.size() : " + notlarArrList.size());

        for (int i = 0; i < notlarArrList.size(); i++) {     // notlararrList.get(i).size():  defterdeki derslerin
            // not listesinin kaç tane oldugunu, yaprak sayısı.


            for (int j = 0; j < notlarArrList.get(i).size(); j++) {   // notlarArrList.get(i).size(): 1 yapraktaki not sayısı

                System.out.println("i. yapraktaki j.not : " + notlarArrList.get(i).get(j));

            }

        }

        // bana öyle bir method yazınki, methoda dersin nosunu gönderecegim bana ortalamasını verecek.

        int matOrt = dersOrtalamaBul(0, notlarArrList);
        System.out.println("matOrt : " + matOrt);

        int turOrt = dersOrtalamaBul(1, notlarArrList);
        System.out.println("turOrt : " + turOrt);

        int kimOrt = dersOrtalamaBul(2, notlarArrList);
        System.out.println("kimOrt : " + kimOrt);

        // öyle bir method yazın ki tüm derslerin ortalamasını bulsun.
        int tumDersOrt = tumDersOrtalamaBul(notlarArrList);
        System.out.println("tumDersOrtBul : " + tumDersOrt);

        // Öyle bir method yazın ki tum derslerdeki 1. sınavın (istenilen) ortalamasını bulsun.
        int sinav1Ort = sinavSiraOrtBul(0,notlarArrList);
        System.out.println("sinav1Ort : " + sinav1Ort);

        // *****  1. odev *****
        // Yukarıdaki örnek de sinavSirasi olarak 3 gönderildiginde yani (4. sınav) hata verecektir.
        // hatanın sebebini ve nasıl duzeltilecegini bulunuz.

        // ***** 2. odev *****
        // Recursive (ÖzYinelemeli Methodlar) konusu google dan ve youtube dan araştırılacak ve ögrenilecek.

    }

    public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>> notlarArrList) {

        int toplam = 0;

        for (int i = 0; i < notlarArrList.get(dersNo).size(); i++) {

            toplam = toplam + notlarArrList.get(dersNo).get(i);
        }

        return toplam / notlarArrList.get(dersNo).size();
    }


    public static int tumDersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarArrList) {

        int tumDersOrt = 0;
        int cevir = 0;

        for (int i = 0; i < notlarArrList.size(); i++) {

            for (int j = 0; j < notlarArrList.get(i).size(); j++) {

                tumDersOrt = tumDersOrt + notlarArrList.get(i).get(j);
                cevir++;

            }
        }
        return tumDersOrt / cevir;

    }

    public static int sinavSiraOrtBul(int SinavSira,ArrayList<ArrayList<Integer>> notlarArrList) {

        // notlarArrLİst.get(0).get(0);   // 1. dersin 1. notu
        // notlarArrLİst.get(1).get(0);   // 2. dersin 1. notu
        // notlarArrLİst.get(2).get(0);   // 3. dersin 1. notu  bu işlemi veren tek forlu yapı aşagıdadır.

        int toplam = 0;

        for(int i = 0; i < notlarArrList.size(); i++){

            toplam = toplam + notlarArrList.get(i).get(SinavSira);
        }
        return toplam / notlarArrList.size();
    }
}








