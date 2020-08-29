package Gun44.throwingException;

import java.io.IOException;
import java.util.Scanner;

public class _8_CheckedThrowExample {

    // kullanıcıdan hava sıcaklıgını isteyiniz.
    // ayrı bir methoda bunun kontrolunu yaparak,
    // hava sıcaklıgı 10 dan kucuk ise IOException hatası oluşturunuz.
    // main den çagırarak hatayı kontrol ediniz.



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hava Sıcaklıgı : ");
        int sicaklik = sc.nextInt();

        try{

            SicaklikKontrol(sicaklik);
        }catch (Exception ex){

            System.out.println("ex : " + ex);
        }
    }

    public static void SicaklikKontrol(int sicaklik) throws IOException {

        // eger bir method içerisinde Checked Throw var ise, methoda adına hata işareti
        // eklenmeden derlenmesine izin verilmez. Hata çizgisni uzerine gelindiginde Add ... a
        //tıklandıgında otomatik ekleyecektir. Bu şekilde bu methodu çagıran yerlerin try catch e
        // alınması garantiye alınmış olur.

        if(sicaklik < 10){

            throw new IOException("Hava gerçekten soguk dışarı çıkma");  // checked olması için bu hata turu seçildi.
        }

        System.out.println("Dışarıda basketbol oynayabilirsin.");
    }
}
