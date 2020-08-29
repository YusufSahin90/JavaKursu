package Gun36.tasks.task1;

public class Book {

    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author){

        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book(String name, int publishYear){

        // 1.yöntem
//        this.name = name;
//        this.publishYear = publishYear;
//        this.author = "";

        // 2. yöntem
        this(name,publishYear,"");
    }

    public Book(String name){

        // 1.yöntem
//        this.name = name;
//        this.publishYear = 0;
//        this.author = "";

        // 2. yönte
        this(name,0,"");
    }

    public Book(){

        // 1.yöntem
//        this.name = "";
//        this.publishYear = 0;
//        this.author = "";

        // 2. yönte
        this("",0,"");
    }

    // toString methodu deniyor. Direk System.out.println(book1); diye yazdırmamızı saglıyor.
    public String toString(){

        return name + " " + publishYear + " " + author;
    }

    public void ShowInfo(){

        System.out.println(name + " " + publishYear + " " + author);

    }
}
