package Gun38.nonAccessModifier.finalModifier.example3;

public class Ex3 {

    final String name;


    public Ex3(String name){

        this.name = name;
    }

    public static void main(String[] args) {

        Ex3 ornek1 = new Ex3("Ayşe");
        Ex3 ornek2 = new Ex3("Ali");

//        ornek1.name = "Ali";     // final oldugu için, ilk deger atama sonrası degistirilemez.
//        ornek2.name = "Zeynep";  // final oldugu için, ilk deger atama sonrası degistirilemez.

        System.out.println("ornek1.name = " + ornek1.name);
        System.out.println("ornek2.name = " + ornek2.name);

    }
}
