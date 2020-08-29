package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {

        // removeAll,   retainAll,    addAl

        Set<Integer> hs1 = new HashSet<>(Arrays.asList(1,2,3,4,5));  // int[] dizi = {1,2,3}  bunun gibi
        Set<Integer> hs2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        // retainAll : Kesişim
        Set<Integer> hsKesisim = new HashSet<>(hs1);   // hs1 den kopya oluşturdum.
        hsKesisim.retainAll(hs2);  // hs1 ile hs2 nin kesişimi bulundu

        System.out.println("hsKesişim : " + hsKesisim);  // ortak elemanlar bulundu

        Set<Integer> hsFark = new HashSet<>();
        // kopya oluşturmanın 2. yöntemi
        hsFark.addAll(hs1);   // hs1 in tamamı hsFark a atandı.
        hsFark.removeAll(hs2);

        System.out.println("hsFark : " + hsFark);

    }
}
