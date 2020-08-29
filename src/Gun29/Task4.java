package Gun29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // kullanıcıya
        // 1- user ekle
        // 2- listeleme
        // 3- arama
        // 4- duzeltme
        // 5- çıkış
        // seçeneklerini vererek username, password, userType (Mudur, çalışan) dan oluşan bir Map tanımlayınız.
        // kullanıcının seçimine göre her bir işlemi ayrı metodda yaptırınız.
        // mainde sadece seçenekler ve metodların çagrılması olsun.
        // bölum bolum gidiyoruz önce mainin içini tasarlayınız.

        // username    password, usertipi
        Map<String, Map<String, String>> users = new HashMap<>();


        Scanner sc = new Scanner(System.in);

        int secim = 0;
        do{
            System.out.println("***** Menu *****");
            System.out.println("1- user ekle");
            System.out.println("2- listeleme");
            System.out.println("3- arama");      // kullanıcıdan bir username alıp bunun bilgilerinin goruntulenmesi saglanacak.
            System.out.println("4- duzeltme");   // kullanıcıdan bir username alıp bunun bilgilerinin degistirilmesi saglanacak.
            System.out.println("5- çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();

            switch(secim){

                case 1:  Ekleme(users);
                    break;
                case 2:  Listeleme(users);
                    break;
                case 3: // arama();
                    break;
                case 4: // duzeltme();
                    break;
            }
        }
        while(secim != 5);

    }
    public static void Ekleme(Map<String, Map<String,String>> users){

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.print("userType: ");
        String userTipi = sc.nextLine();

        Map<String, String> bilgilerMap = new HashMap<>();   // burada bir kartvizit gibi map e atıldı.

        bilgilerMap.put("password", password);
        bilgilerMap.put("userType", userTipi);

        users.put(username, bilgilerMap);   // burada kullanıcının verdigi isme kartvizit gibi bilgiler atıldı.
    }
    public static void Listeleme(Map<String, Map<String, String>> users){

        System.out.println("users : " + users);
    }

}
