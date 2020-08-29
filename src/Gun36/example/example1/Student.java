package Gun36.example.example1;

// bir tür yapısı: class
public class Student {

    int id;
    String name;
    String surName;
    int classroom;

    // Constructor : yapıcı method: ilk oluşmada yapılması istenen işlemlerin
    // yazıldıgı method.
    public Student(int id, String name, String surName, int classroom){

        // this : class ın kendisini gösteriyor, yani Student i gösteriyor.
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.classroom = classroom;

//        System.out.println("constructor çalıştı");

    }
    public Student(int id, String name, String surName){

        // this : class ın kendisini gösteriyor, yani Student i gösteriyor.
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.classroom = 0;

    }
    public Student(int id, String name){

        // 1. yöntem ile uzun yazarız.
//        this.id = id;
//        this.name = name;
//        this.surName = "";
//        this.classroom = 0;

        // 2. yöntem ile kısa yazabiliriz, daha kullanışlı.
        this(id,name,"",0);
    }
    public Student(int id){

        // 1. yöntem ile uzun yazarız.
//        this.id = id;
//        this.name = "";
//        this.surName = "";
//        this.classroom = 0;

        // 2. yöntem ile kısa yazabiliriz, daha kullanışlı.
        this(id,"","",0);
    }
    public Student(){

        // 1. yöntem ile uzun yazarız.
//        this.id = 0;
//        this.name = "";
//        this.surName = "";
//        this.classroom = 0;

        // 2. yöntem ile kısa yazabiliriz, daha kullanışlı.
        this(0,"","",0);


    }


    // 2. yöntem için yazıldı.
//    public static Student createStudent(int id, String name, String surName, int classroom){
//
//        Student ogrenci1 = new Student();
//
//        ogrenci1.id = 1;
//        ogrenci1.name = "Ayşe";
//        ogrenci1.surName = " Yılmaz";
//        ogrenci1.classroom = 10;
//
//        return ogrenci1;
//
//
//    }
}
