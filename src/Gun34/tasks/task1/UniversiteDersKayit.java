package Gun34.tasks.task1;

public class UniversiteDersKayit {

    // Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    // Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    // öğrencilere eklenecek.
    // 1- Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız : fields: name, hour
    // 2- Adım : Ders oluşturma metodunu yazınız.
    // 3- Adım : 3 adet ders tanımlayınız.
    // 4- Adım : Student isminde yeni bir class tanımlayınız:
    //          fields : name, maxAlabilecegiDersSaatMiktarı
    // 5- Adım : ögrenci oluşturmayı bir method ile yazınız. createStudent
    // 6- Adım :  2 adet ögrenci oluşturunuz:
    //          Adı : Mehmet, maxAlabilecegiDersSaatMiktarı = 20 olsun
    //          Adı : Ayşe, maxAlabilecegiDersSaatMiktarı = 12 olsun.


    public static void main(String[] args){

        // method static oldugundan nesne tanımlanmasına gerek kalmadan
        // direk çagrılabiliyor. aşagıdaki gibi.

        Lesson mat101 = Lesson.createLesson("mat101",6);
        Lesson fiz101 = Lesson.createLesson("fiz101",4);
        Lesson java101 = Lesson.createLesson("java101",6);

        Student ogr1 = Student.createStudent("Mehmet",20);
        Student ogr2 = Student.createStudent("Ayşe",12);

        ogr1.lessonadd(mat101);
        ogr1.lessonadd(fiz101);
        ogr1.lessonadd(java101);

        ogr2.lessonadd(mat101);
        ogr2.lessonadd(fiz101);
        ogr2.lessonadd(java101);

        ogr1.printLessons();
        ogr2.printLessons();


    }

}
