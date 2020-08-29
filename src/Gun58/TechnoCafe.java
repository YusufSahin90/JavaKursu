package Gun58;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {


    public static void main(String[] args) {

        AdanaKebap adanaKebap = new AdanaKebap();
        Lahmacun lahmacun = new Lahmacun();
        Borsh borsh = new Borsh();
        Palov palov = new Palov();
        ArrayList<IFood> siparisler = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int secim = 0;


        do {
            System.out.println("**********************************************");
            System.out.println("*****MENU*****");
            System.out.println("1- AdanaKebap" + "\n" +
                               "2- Lahmacun" + "\n" +
                               "3- Borsh" + "\n" +
                               "4- Palov" + "\n" +
                               "5- Exit");
            System.out.print("Siparişleri girebilirsiniz : ");
            secim = sc.nextInt();

            switch (secim) {

                case 1: {
                    siparisler.add(adanaKebap);
                    break;
                }
                case 2: {
                    siparisler.add(lahmacun);
                    break;
                }
                case 3: {
                    siparisler.add(borsh);
                    break;
                }
                case 4: {
                    siparisler.add(palov);
                    break;
                }
            }
        }while(secim !=5);

        int sayac = 0;

        for( IFood food : siparisler){

            sayac++;

            System.out.println("Siparişleriniz : " + sayac +"." +  food.getClass().getSimpleName());
        }
        double toplamTutar = 0;
        for (IFood food : siparisler){

            TechnoKitchen.Kochen(food);
            toplamTutar += food.ucret();
        }
        System.out.println("ToplamTutar : " + toplamTutar + " Euro.");
    }
}
