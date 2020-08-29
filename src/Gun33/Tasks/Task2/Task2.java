package Gun33.Tasks.Task2;

import java.util.ArrayList;

public class Task2 {

    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    // 2- Ögrenci sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, ders listesi tutacak bir liste.
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet ögrenci tanımlayınız alabilecegi maxCredit 10 olsun.
    // 5- bu ögrencinin ders listesine, açılmış dersleri ekleyiniz.
    //    ders eklerken max alabilecegi Credit i geçmemeli, geçerse uyarı versin,
    //    alabileceginiz max credi doldu şeklinde.
    // Ödev
    // 6- Aşagıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir method oluşturunuz.
    // 7- ögrenciye ders ekleme bolumunu yine ilgili sınıfta bir method olarak yazınız.

    public static void main(String[] args) {

    Lesson mat101 = new Lesson();
    mat101.name = "Matematik";
    mat101.credit = 3;

    Lesson java101 = new Lesson();
    java101.name = "Java Programming";
    java101.credit = 6;

    Lesson fiz101 = new Lesson();
    fiz101.name = "Fizik";
    fiz101.credit = 4;

    Student student1 = new Student();

    student1.name = "Ayse";
    student1.maxCredit = 10;

    student1.dersListesi = new ArrayList<>();

    // buraya kontrol konacak toplam aldıgı krediye bakılarak
    // eklenecek ders ile ögrencinin o ana kadar ki kredisi toplamı
        // ogrencinin alabilecegi max krediyi aşmıyorsa ekle

        if(student1.totalCredit() + mat101.credit <= student1.maxCredit){

            student1.dersListesi.add(mat101);

        }else{

            System.out.println("mat101 için alabileceginiz kredi miktarı doldu");
        }

        if (student1.totalCredit() + fiz101.credit <= student1.maxCredit) {

            student1.dersListesi.add(mat101);

        }else{

            System.out.println("fiz101 için alabileginiz kredi miktarı doldu");
        }

        if(student1.totalCredit() + java101.credit <= student1.maxCredit){

            student1.dersListesi.add(java101);

        }else{

            System.out.println("java101 için alabileceginiz kredi miktarı doldu");
        }
    }
}



