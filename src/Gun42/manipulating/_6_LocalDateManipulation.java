package Gun42.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class _6_LocalDateManipulation {


    // testPlus adında bir test metodu yazınız. Bugunun tarihi alınız. Daha Sonra 1 gun, 1 Ay ve 1 yıl ekleyerek
    // 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.

    @Test
    public void testPlus() {

        LocalDate bugun = LocalDate.now();
        LocalDate actual = bugun.plusDays(1).plusMonths(1).plusYears(1);

        String expect = "2021-08-22";

        Assert.assertEquals("Sizin sonucunuz" + actual + "ama sonuc 2021-08-22 olmali", expect, actual.toString());
        // expected: beklenen, actual ise oluşan demektir.
    }

    // testMinus adında bir test methodu yazınız. Bugunun tarihi alınız. Daha sonra 1 gun, 1 ay ve 1 yıl çıkartarak
    // 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.
    @Test
    public void testMinus() {

        LocalDate today = LocalDate.now();
        LocalDate actual = today.minusDays(1).minusMonths(1).minusYears(1);

        String expect = "2019-06-20";

        Assert.assertEquals(expect, actual.toString());
    }
}



