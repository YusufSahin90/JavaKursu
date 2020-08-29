package Gun05;

public class Ornek11 {
    public static void main(String[] args) {

//        String olarak verilen Gece ve Gündüz hava sıcaklığı bilgisinin toplamını yazdırınız.


        String geceStr = "5";
        String gündüzStr = "20";

        int gece = Integer.parseInt(geceStr);
        int gunduz = Integer.parseInt(gündüzStr);
        int toplamhavaderecesi = gece + gunduz;

        System.out.println("gecehavaderecesi : " + gece +  " " + "gündüzhavaderecesi : " + " " + gunduz);
        System.out.println("Toplam hava derecesi : " + toplamhavaderecesi);



    }
}
