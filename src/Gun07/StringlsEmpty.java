package Gun07;

public class StringlsEmpty {
    public static void main(String[] args) {

        // string bos mu degil mi onu kontrol ediyor, sonuc true false

        String str1 = "Hi";
        System.out.println("str1 ici bos mu = " + str1.isEmpty());

        String str2 = "";
        System.out.println("str2 ici bos mu = " + str2.isEmpty());

        String str3 = " ";                       // burada boşluğu karakter olarak gordugu icin true deger verdi.
        System.out.println("str3 ici bos mu = " + str3.isEmpty());

        boolean bosmu = str3.isEmpty();          // boolean degiskenine atanabilir.












    }
}
