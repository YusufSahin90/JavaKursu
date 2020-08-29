package Gun42.DigerIslemler;

import java.time.LocalDate;

public class _3_ComparingDateAndTime {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean after = bugun.isAfter(dun);   // bugun dunden sonra mı ?  true
        System.out.println("after = " + after);

        boolean before = bugun.isBefore(dun);  // bugun dinden once mi ?  false
        System.out.println("before = " + before);

        boolean equal = bugun.isEqual(dun);  // bugun dun e eşit mi =?  false
        System.out.println("equal = " + equal);

        boolean leapYear = bugun.isLeapYear();  // artık yıl mı ?
        System.out.println("leapYear = " + leapYear);

        int fark = bugun.compareTo(dun);   // 2 tarih arasındaki farkın en buyuk parcası arasındaki farkı verir.
        System.out.println("fark = " + fark);

        //        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        //        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        //        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için


    }
}
