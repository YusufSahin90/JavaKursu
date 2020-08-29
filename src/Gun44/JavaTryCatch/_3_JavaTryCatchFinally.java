package Gun44.JavaTryCatch;

public class _3_JavaTryCatchFinally {
    public static void main(String[] args) {

        System.out.println("try bloguna girmeden önceki kodlar çalıştı");

        try{  // hatanın olma ihtimalini oldugu kodların alındıgı blok
            // database i aç
            String str = "bugun";
            System.out.println("hatadan bir önceki adım");
            char ilkHarf = str.charAt(0);  // hata oldugunda try ın içindeki sonraki bolumler çalışmaz.
            System.out.println("hatadan bir sonraki adım");
        }
        catch(Exception ex){  // hata oldugunda çalışacak kodlar bu bloga yazılır.

            System.out.println("Catch bolumu çalıştı");

        }finally {  // hata olsun veya olmasın çalışacak final bolumu : herzaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış işlemlerde arda kalan kapama gibi bu bolume ait işlemler
            // yapılarak kod duzeni saglanmış olur.

            System.out.println("Finally bolumu çalıştı.");
            // database kapat.
        }

        System.out.println("tum hata kodlarından sonraki normal kodların yazıldıgı bolum çalıştı.");

    }
}
