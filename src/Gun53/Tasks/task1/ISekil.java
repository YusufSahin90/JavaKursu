package Gun53.Tasks.task1;

public interface ISekil {

    final double PI = 3.14;

    // int ... kullanıdıgında gelen butun sayılar dizinin bir elemanı gibi islem gorur ve dizi degiskenine atanır.

    int cevresi(int... dizi);
    int alani(int... dizi);

}

// cevresi(int ...dizi) nin anlami
// bu method a birden fazla int deger 2,3,4 şeklinde gonderilebilir demektir.
// ve dizi[0], dizi[1], dizi[2] gibi gelen sayi kadar islem gorur.