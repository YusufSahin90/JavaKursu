package Gun03;

public class JavaDataTypes {
    public static void main(String[] args) {

        // yorum satırı kısa yolu  //  ctrl + /
        // çoklu yorum stırı haline getirme /*   */   :  ctrl + shift+ /

//        Data tipleri : Primitive ve Non Primitive tipler

// todo       byte, short, int, long, float, double, char, boolean : ilkel yani temel tipler

//        Diziler, string, Class : ilkel olmayan tipler


        /* Tam sayılar için default int
        127 kadar ise byte:            1 byte
        32767 kadar is short:          2 byte
        2 milyar dan büyük ise long:   4 byte
        2 milyar dan büyük ise long:   8 byte

        Ondalıklı sayılar için default double
        float:   32 bit : noktadan sonra 7 hane tutabiliyor.
        double:  64 bit : noktadan sonra 15 hane tutabiliyor.

        char : 65000 e kadar : 2 byte : unicode harfleri saklar 'A' -> 65

        boolean : 1 bit : true, false


        */



        byte byteDeger = 4;
        short shortDeger = 3000;
        int intDeger = 200000;
        long longDeger = 1234599999;

        float floatDeger = 3.14f;
        float floatDeger2 = 5.246802468f;
        double doubleDeger = 3.14;
        double doubleDeger2 = 5.123456789012345678901234567890;

        char charDeger1 ='A';   // karakterler tek tırnakla atanıyor.
        char charDeger2 = 25;

        boolean boolDeger1 = true;
        boolean boolDeger2 = false;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("floatDeger2 = " + floatDeger2);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("doubleDeger2 = " + doubleDeger2);
        System.out.println("charDeger1 = " + charDeger1);
        System.out.println("charDeger2 = " + charDeger2);
        System.out.println("boolDeger1 = " + boolDeger1);
        System.out.println("boolDeger2 = " + boolDeger2);

    }
}
