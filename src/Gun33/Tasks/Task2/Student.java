package Gun33.Tasks.Task2;

import java.util.ArrayList;

public class Student {

    // fields

    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;

    public int totalCredit(){

        int total = 0;

        for(Lesson ders : dersListesi){

            total = total + ders.credit;
        }
        return total;
    }

}
