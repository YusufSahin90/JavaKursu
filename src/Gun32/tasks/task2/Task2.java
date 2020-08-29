package Gun32.tasks.task2;

public class Task2 {

    // 1. adım : ayrı dosyada olmak uzere Customer isimli (fields : name) isimli bir class tanımlayınız.
    // 2. adım : ayrı bir dosyada(Class) ElectricityAccount isimli (fields : totalKw, rate(double), bill )
    // 3. adım : Customer a bir ElectricityAccount ekleyiniz.
    // 4. adım : 1 tane musteri olusturunuz, Account u dahil.
    // 5. adım : musteriye ait her ay tuketilen enerjiyi toplayacak bir method yazınız.
    // 6. adım : odenecek rakamı toplam tuketimi rate ile çarparak hesaplatınız ve yazdırınız.

    public static void main(String[] args) {
        // 4. adımda hem musteriyi hemde elektrik aboneligini olusturduk.

        Customer musteri1 = new Customer();

        musteri1.name = "Kaya";
        musteri1.electricityAccount = new ElectricityAccount();
        
        musteri1.electricityAccount.tuketimEkle(100);  // Ocak ayı tuketimi
        musteri1.electricityAccount.tuketimEkle(150); // Şubat ayı tuketimi

        System.out.println("musteri1.electricityAccount.totalKw = " + musteri1.electricityAccount.totalKw);

        System.out.println("musteri1.electricityAccount.totalBill() = " + musteri1.electricityAccount.totalBill());

        System.out.println("musteri1.electricityAccount.bill = " + musteri1.electricityAccount.bill);

    }
}
