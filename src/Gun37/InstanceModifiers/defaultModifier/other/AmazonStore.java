package Gun37.InstanceModifiers.defaultModifier.other;

import Gun37.InstanceModifiers.defaultModifier.same.Book;

public class AmazonStore {
    public static void main(String[] args) {

//         Book kitap1 = new Book();   // default oldugundan diger paketten ulaşılamaz

        Book kitap2 = new Book("yagmur");   // bu contructor a ulaşabildim çunku public

    }
}
