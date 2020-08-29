package Gun55.Tasks.task2;

import java.text.DecimalFormat;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen(4,5);
        dd.setName("Yeni Dikdortgen");
        System.out.println(dd);
        dd.ciz();

        Cember cm = new Cember(6);
        cm.setName("Yeni Cember");
        System.out.println(cm);
        System.out.println(cm.toString2());
        cm.ciz();


    }
}
