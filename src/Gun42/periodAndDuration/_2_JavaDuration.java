package Gun42.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0, 0);
        LocalTime ogleVakti = LocalTime.of(13, 3, 2, 5);

        Duration fark = Duration.between(ogleVakti, geceYarisi);

        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours());      // gun dahil Toplam saati verir.
        System.out.println("fark.toMinutes() = " + fark.toMinutes());  // saat dahil toplam dakikayı verir.
        System.out.println("fark.toDays() = " + fark.toDays());        // Toplam gunu verir.

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());      // bu bolum sadece saat bolumunu verir.
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());  // bu bolum sadece bolumunu dakikayı verir, toplamı vermez.
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());  // bu bolum saniye bolumunu verir.
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());    // bu bolum sadece milisayineyi verir.
        System.out.println("fark.toNanosPart() = " + fark.toNanosPart());      // bu bolum sadece nanosaniye parçasını verir.


    }
}
