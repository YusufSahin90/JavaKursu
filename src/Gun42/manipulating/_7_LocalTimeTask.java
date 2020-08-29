package Gun42.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class _7_LocalTimeTask {

    // using current LocalTime
    // 1. test current time with plus minute and plus hour :
    // şu andaki zamana 1 saat ve 1 dakika ekleyerek sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    // 2. test current time with minus minute and plus hour:
    // şu andaki zamana 1 sat ve 1 dakika çıkartarak sonucun saatini ve dakikasını ayrı ayrı test ediniz.


    @Test
    public void testPlus(){


        LocalTime time = LocalTime.now();
        LocalTime actualtime = time.plusHours(1).plusMinutes(1);  // anlık yani aktuel saat ve dakikayı 1 artırdık, sonra test ettik testten geçicek mi diye.

        Assert.assertEquals(22,actualtime.getHour());
        Assert.assertEquals(53,actualtime.getMinute());
    }

    @Test
    public void testMinutes(){

        LocalTime time = LocalTime.now();
        LocalTime actualtime = time.minusHours(1).minusMinutes(1);  // anlık yani aktuel saat ve dakikayı 1 azalttık, sonra test ettik testten geçicek mi diye.

        Assert.assertEquals(20,actualtime.getHour());
        Assert.assertEquals(51,actualtime.getMinute());
    }
}
