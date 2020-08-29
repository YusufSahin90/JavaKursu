package Gun38.nonAccessModifier.finalModifier.example2;

public class persons {
    public static void main(String[] args) {

        Person kisi1 = new Person("ismet",12);
        // kisi1.fingerprintCode = 12;   // deger degistirilemez.
        // çunku ilk degeri aldı.

        System.out.println("kisi1 = " + kisi1);

        Person kisi2 = new Person("ahmet",15);
        // kisi2.fingerprintCode = 17;    // deger degistirilemez.

        System.out.println("kisi2 = " + kisi2);

    }
}
