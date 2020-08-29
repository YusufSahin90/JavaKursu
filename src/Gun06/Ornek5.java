package Gun06;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Kullanıcıdan kaç bilet istediğini ve sigorta isteyip istemediğini (boolean) olarak alıp konsola yazdırınız.


        System.out.print("Bilet miktarını giriniz : ");
        int bilet = scanner.nextInt();
        System.out.print("Sigorta ister misiniz ? (Örnek: true yada false) :");
        boolean sigorta = scanner.nextBoolean();

        System.out.println("Biletiniz : " + bilet + " " + "adet" + " " + "Sigorta seçiminiz: " + sigorta );




    }
}
