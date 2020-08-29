package Gun36.tasks.task2;

public class Task2 {
    public static void main(String[] args) {

        // bir banka class ı tanımlayınız.
        // 3 adet feilds ekleyiniz.
        // 3 adet constructor ekleyiniz.
        // toString methodu oluşturun.
        // 3 tane nesne oluşturup main de yazdırınız.

        // 1. yazdırma yöntemi
        Banka banka1 = new Banka("Ahmet",1990,"Vakıfbank");
        
        Banka banka2 = new Banka("Mehmet",1856,"İş bankası");
        
        Banka banka3 = new Banka("Osman",1850,"Ziraat bankası");
        
        Banka banka4 = new Banka();

        banka4.name = "Toprak";
        banka4.year = 1898;
        banka4.bankaName = "Volksbank";

        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
        System.out.println("banka4 = " + banka4);
        
    }
}
