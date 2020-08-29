package Gun44.uncheckedAndCheckedExceptions;

import java.io.FileInputStream;

public class _5_JavaCheckedException {
    public static void main(String[] args) {

        // dosya okuma/yaza işlemi
        // bu işlemlerde hata olasılıgı yuksek oldugundan
        // hata kontrolu zorunlu tutuluyor.
        // bu yuzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi sorunlara karşılık gelen hatalara Checke Exception denir.
        // Özellikle IO (InputOutput) işlemleri Checked Exception dır.

        try{

            FileInputStream file = new FileInputStream("dosya.txt");

        } catch(Exception ex){

        }
    }
}
