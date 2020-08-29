package Gun37.InstanceModifiers.defaultModifier.same;

public class BookStore {
    public static void main(String[] args) {

        // aynı paketin içinde oldugundan
        // default a ulaşabildik.

        Book kitap1 = new Book();
        kitap1.name = "Lord of the Rings";


        // zaten public oldugundan sınır yoktu.
        Book kitap2 = new Book("kar");
    }
}
