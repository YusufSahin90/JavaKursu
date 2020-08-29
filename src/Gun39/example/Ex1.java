package Gun39.example;

import java.util.ArrayList;

public class Ex1 {

     static final String name = "Maximilian";  // static final kullanırsak degisiklige izin vermez.
//    static String name = "Maximilian";   // sadece static kullanırsak degisiklige izin verir, yani buraya başka bir deger atayabiliriz.

    static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Replace = " + name.replace("i","o"));  // name = Maxomoloan
        // burada name in degeri degişmedi, name in bir kopyasını alarak degişmiş halini verdi bize, name in iç degeri degismedi.
        // atama yapmadıgımız surece degismez.
        System.out.println("1.name = " + name); // 1.name = Maximilian  // burada name in degismedigini görduk.

//        name = name.replace("i","o");   // burada atama yaptıktan sonra name in degeri degişti.
        // (final kullanırsak bu şekilde degistiremeyiz.)

//        System.out.println("2.name = " + name); // 2.name = Maxomoloan  // name in degeri atama yapıldıgı için degisti.
        // (final kullanırsak bu şekilde degistiremeyiz.)

        list.add("Ahmet");
        list.add("Alperen");
        System.out.println("Önce list.toString() = " + list.toString());

        // yukarıda ArrayList i final yaptıgımız için burada list kızardı, yani degistirmeye izin vermiyor.
//        list = new ArrayList<>();   // clear();   gibi işlev göruyor.
//        System.out.println("Sonra list.toString() = " + list.toString());

    }


    // Static bir methodun içinde kullanacagınız her şey static veya
    // new ile yeni olşuturulmuş olmalı.
    // Sebebi:  Static bir canlı bir yapı oldugundan içinde kullanılanlarda o anda erişilebilir canlı yani static olmalı.
}
