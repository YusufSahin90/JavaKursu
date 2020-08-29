package Gun23;

public class JavaMethods2 {
    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 7;

        int sonuc = toplamBul(sayi1,sayi2);

        Math.max(3,4);  // bu şekilde yazmamızın hiçbir faydası yok,
                        //  çunku işlemin soucu herhangi bir degiskene atanmadı.

        int sayı3 = 7;    //  bana önceki toplamın degeri lazım, şu anda sonuca toplamın sonucu geldi

    }

    public static int toplamBul(int a, int b){

        int toplam = a + b;
        System.out.println("toplam : " + toplam);

        return toplam;
    }
}
