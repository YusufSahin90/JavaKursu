package Gun24;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        int[] dizi=new int[]{2,3,4,5}; // dizilerde tanımlarken başlangıç değerler verebiliyorduk
        // ArrayList de de başlangıç değerlerini bir seçenek olarak istersek aşağıdaki gibi verebiliriz

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Almanca");
        list1.add("İngilizce");
        list1.add("Turkçe");
        list1.add("Rusça");


        System.out.println("list1 : " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rusça");
        list2.add("Turkçe");
        list2.add("Arapça");

        System.out.println("list2 : " + list2);

        list1.removeAll(list2);
        System.out.println("list1 : " + list1);
    }
}



















