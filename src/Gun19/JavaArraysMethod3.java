package Gun19;

import java.util.Arrays;

public class JavaArraysMethod3 {
    public static void main(String[] args) {

        //  Arrays.toString(Array) -> dizinin butun elemanlarını yazdırır.

        String[] names = {"ahmet", "ayşe", "kaya", "deniz"};
        System.out.println(".toString: " + Arrays.toString(names));

        // Arrays.sort(array) diziyi sıralar

        Arrays.sort(names);
        System.out.println(".sort : " + Arrays.toString(names));

        // Arrays.equals(array1,array2) -> Butun elemanların sırası ile aynı olup olmadıgını kontrol eder.

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};

        System.out.println("a==b : " + Arrays.equals(a,b));  // true
        System.out.println("a==c : " + Arrays.equals(a,c));  // false

        // Arrays.fill(array, value); butun elemanlara value degerini atar.

        int[] numbers = new int[5];
        System.out.println("atamadan önce default degerler : " + Arrays.toString(numbers));
        Arrays.fill(numbers, 7);
        System.out.println("atamadan sonra default degerler : " + Arrays.toString(numbers));

        // Arrays.binarySearch(array, value) sıralı bir dizide aranan deger var ise
        // index ini verir, yok ise - deger döndurur.
        // sıralamadan önce yani sıralı degilse istedigimiz bir karakterin yada sayının rastgele bir degerini verir
        // sıraladıktan sonra dogru degeri verir, eger deger yoksa (-) olarak verir.

        int[] rakamlar={2,7,6,13,0,12,6,3};
        System.out.println("önce 8 in index i : " + Arrays.binarySearch(rakamlar,8));
        System.out.println("önce 7 nin index i : " + Arrays.binarySearch(rakamlar,7));
        System.out.println("önce 2 nin index i : " + Arrays.binarySearch(rakamlar,2));
        System.out.println("önce 123 in index i : " + Arrays.binarySearch(rakamlar,123));
        Arrays.sort(rakamlar);
        System.out.println("sonra 8 in index i : " + Arrays.binarySearch(rakamlar,8));
        System.out.println("sonra 7 in index i : " + Arrays.binarySearch(rakamlar,7));
        System.out.println("sonra 2 in index i : " + Arrays.binarySearch(rakamlar,2));

    }
}
