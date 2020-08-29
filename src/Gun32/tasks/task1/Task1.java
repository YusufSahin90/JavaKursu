package Gun32.tasks.task1;

public class Task1 {

    // 1. adım : Rectangle isminde bir sınıf yazınız. fields: width, length
    // 2. adım : çevre bulmak uzere getPerimeter isminde bir method yazınız.
    // 3. adım : dikdörtgenin alanını bulan getArea isimli bir method yazınız.

    public static void main(String[] args) {

        Rectangle dikdortgen = new Rectangle();

        dikdortgen.width = 5;
        dikdortgen.length = 4;

        System.out.println("dikdortgen.getPerimeter() = " + dikdortgen.getPerimeter());
        System.out.println("dikdortgen.getArea() = " + dikdortgen.getArea());

    }
}


