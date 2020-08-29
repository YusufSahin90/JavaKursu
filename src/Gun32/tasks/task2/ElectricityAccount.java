package Gun32.tasks.task2;

public class ElectricityAccount {

    // fields

    int totalKw = 0;
    double rate = 0.7;
    double bill;

    // kendisine verilen tuketim degerini totalKw isimli degiskene ekleyerek toplam tuketimi olusturuyor.
    void tuketimEkle(int tuketim){

        totalKw = totalKw + tuketim;

        }

        double totalBill(){

        bill = rate * totalKw;

        return bill;
    }
}

