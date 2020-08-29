package Gun23;

import java.util.Scanner;

public class JavaMethods5 {
    public static void main(String[] args) {

        // Kullanıcı bir ögretmendir.
        // önce ögrencinin adı girilecek, sonra aldıgı farklı miktardaki notları girilecek.
        // Ahmet Demir bu okunduktan sonra
        // 80 56 78 90 okutulacak ve ögrenci adı ve ortalaması yazılacak ekrana
        // ortalama bulma işlemini bir fonksiyonda yapınız, fakat sonucu yazdırma işlemini
        // main de yaptırınız. Her ögrenci farklı sayıda not girilebilir.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ögrenci adı ve soyadı: ");
        String isim = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Ögrencinin notları : ");
        String strNotlar = sc2.nextLine();      //  60 40 70 80

        System.out.println("Ögrenci : " + isim);
        System.out.println("Ortalaması : " + ortalamaBul(strNotlar));

    }
    public static double ortalamaBul(String notlar){

        double toplam = 0;
        String[] notDizi = notlar.split(" ");

        for(int i = 0; i < notDizi.length; i++){

            toplam = toplam + Integer.parseInt(notDizi[i]);
        }
        return toplam / notDizi.length;
    }
}
