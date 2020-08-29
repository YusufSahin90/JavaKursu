package Gun59;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        // kullanıcıya hangi bankada hesap açmak istedigini sorup bir menu ile
        // hesabını açınız
        // sonra kullanıcya yine bir menu ile para yatırma ve cekme işlemi istemiyorsa cıkıs
        // işlemi yaptırınız.
        // en son bankanın bakiyesini(balance) yazdırınız.


        Scanner sc = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("Hangi bankadan hesap acmak istiyorsunuz ?");
        System.out.println("1- BOA");
        System.out.println("2- WellsFargo");
        System.out.println("3- ChaseBank");
        System.out.print("Seciminiz: ");
        int bankaSecim = sc.nextInt();


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Adınız: ");
        String ad = sc2.nextLine();

        System.out.print("Telefon no: ");
        String telNo = sc2.nextLine();

        System.out.print("Adres: ");
        String adres = sc2.nextLine();


        int employeeNo = 1;   // işlemi yapan çalısanın sicilnosu

        Bank hesabinBankasi = null;

        switch (bankaSecim) {

            case 1:

                // Bank hesabinBankasi = new BOA(ad, telNo, adres, employeeNo);
                hesabinBankasi = new BOA(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

            case 2:

                hesabinBankasi = new WellsFargo(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

            case 3:

                hesabinBankasi = new ChaseBank(ad, telNo, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;
        }

        System.out.println(hesabinBankasi);

        int secim = 0;

        do{

            System.out.println("*****İşlem Menusu*****");
            System.out.println("1- Para Yatır\n2- Para çek\n3- Kredi Talep\n" +
                    "4- Bakiye goruntuleme\n5- Hesap Kapat\n6- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();

            double miktar = 0;

            switch(secim){

                case 1:

                    System.out.print("Miktar : " );
                    miktar = sc.nextDouble();
                    hesabinBankasi.deposit(miktar);
                    break;

                case 2:

                    System.out.print("Miktar : ");
                    miktar = sc.nextDouble();
                    hesabinBankasi.withdraw(miktar);
                    break;

                case 3:

                    System.out.println(hesabinBankasi.loan());
                    break;

                case 4:

                    System.out.println("Bakiye : " + hesabinBankasi.getBalance());
                    break;

                case 5:

                    hesabinBankasi.closeAccount();
                    break;

                case 6:

                    System.out.println("Sistemden çıkılıyor... Yine bekleriz :) ...");
            }

        }while(secim != 6);


    }
}
