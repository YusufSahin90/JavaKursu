package Gun54.Tasks.task1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar("Tesla p98",310);

        ToyotaPrius toyota = new ToyotaPrius("pirus",1208);

        Bus otobus = new Bus("302",6000);

        tesla.print();
        IElectric.autoPilot();

        ArrayList<Vehicle> galeri = new ArrayList<>();
        ArrayList<IVehicle> galeri2 = new ArrayList<>();

        galeri.add(tesla);
        galeri.add(toyota);
        galeri.add(otobus);

        for (Vehicle glr : galeri){

            // burada glr.getClass().getSimpleName(); ile hangi class lardan geldiklerini yazdırdık.
            System.out.println("Class ismi : " + glr.getClass().getSimpleName());
        }

    }
}
