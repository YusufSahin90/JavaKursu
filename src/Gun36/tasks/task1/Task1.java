package Gun36.tasks.task1;

public class Task1 {
    public static void main(String[] args) {


        // bir Book class ı yazınız. fields: name, publishYear,author.
        // 3 adet Constructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir method ekleyiniz.
        // 3 adet kitabı farklı methodlarla oluşturup, main de yazdırınız.

        Book book1 = new Book("Java",2000,"Oracle");

        Book book2 = new Book("Pyhton",2005,"Pyhton123");

        Book book3 = new Book("C++",2010);

        Book book4 = new Book("Kavgam");

        Book book5 = new Book();

        book5.name = "Rüzgarlar";
        book5.publishYear = 1990;
        book5.author = "Ömer Seyfettin";

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();
        book4.ShowInfo();
        book5.ShowInfo();

//        int sayi = 5;
//        System.out.println(sayi);  //toString yapıyor otomatik olarak

        System.out.println(book1);  // book1 in String e çevrilmiş hali, yani toString
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);

        System.out.println(book1.toString());  // aslında böyle yapıyor.

        System.out.println("book1.name = " + book1.name);
    }
}
