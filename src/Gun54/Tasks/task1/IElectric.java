package Gun54.Tasks.task1;

// bir interface bir başka interface den mirasını aldık, yani extends ettik.
public interface IElectric extends IVehicle {
    public static void main(String[] args) {

    }



        final static int batteryLİfe = 100;


    String changeBattery();
    // soyut yani suslu parantezli kısmı olmayan, yani gövdesi olmayan, sadece adı ve parametreleri olan
    // methodalara Abstract method denir.

    // Interface lerde sadece asagıdaki 2 şekilde gövdeli method kullanılabilir.

    // default belirteciyle, implemente zorunlu degil.
    default void print(){

        System.out.println("default belirteciyle method yazılabilir.");
    }

    // veya static şekilde
    static void autoPilot(){

        System.out.println("otonom suruş modu.");
    }

}
