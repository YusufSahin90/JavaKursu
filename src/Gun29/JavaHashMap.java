package Gun29;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {

        Map<Integer,Integer> m = new HashMap<>();

        m.put(2,11);   // 2 anahtarına 11 degeri set edildi
        m.put(3,12);
        m.put(4,13);
        m.put(2,14);   // 2 anahtarındaki deger guncellendi

        System.out.println("m.get(2) : " + m.get(2));    // 2 anahtarındaki deger alındı.  m.get(2) : 14
        System.out.println("a.keySet() : " + m.keySet());  // anahtar listesi keyler.      a.keySet() : [2, 3, 4]
        System.out.println("m.values() : " + m.values());  // degerler listesi values      m.values() : [14, 12, 13]
        System.out.println("m : " + m);    // m : {2=14, 3=12, 4=13}

        // 2. yöntemler
        for(Integer ky : m.keySet()){

            System.out.println("ky : " + ky);
        }

        for(Integer vl : m.values()){

            System.out.println("vl : " + vl);
        }

        for(Map.Entry<Integer,Integer> anahtarVeDeger : m.entrySet()){

            System.out.println("anahtarVeDeger.getKey() : " + anahtarVeDeger.getKey());  // bu anahtarı veriyor
            System.out.println(", anahtarVeDeger.getValue() : " + anahtarVeDeger.getValue());  // bu ise degeri veriyor
            System.out.println();
        }

        boolean buAnahtarVarMi = m.containsKey(2);  // 2 şeklinde bir anahtar var mı ?
        boolean buDegerVarMi = m.containsValue(12);  // 12 degeri var mı ?

        System.out.println("buAnahtarVarMİ : " + buAnahtarVarMi);
        System.out.println("buDegerVarMİ : " + buDegerVarMi);

        m.remove(2);
        System.out.println("remove 2 den sonra : " + m);

        m.clear();
        System.out.println("clear den sonra : " +m);


    }
}
