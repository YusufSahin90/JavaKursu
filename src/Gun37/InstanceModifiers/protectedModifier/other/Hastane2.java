package Gun37.InstanceModifiers.protectedModifier.other;

import Gun37.InstanceModifiers.protectedModifier.same.Doktor;

public class Hastane2 {
    public static void main(String[] args) {

        // protected oldugunda default gibi
        // diger paketlerden kullanılamıyor
        // Doktor dr3 = new Doktor();

        // bu erişim public oldugundan kullanılabildi.
        Doktor dr4 = new Doktor("Ömer");

        // erişim belirteci protected oldugundan kullanılmaz.
        // dr4.print();

    }
}
