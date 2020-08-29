package Gun34.example.ex1;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {


    @Test
    public void testGetArea(){

        // nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen = new Rectangle();
        dikdortgen.length = 5;
        dikdortgen.width = 4;

        // beleyen yani actual degeri al
        int sonuc = dikdortgen.getArea();  // actual deger yani o anda gelen deger.

        // Assert ile karşılaştır
        Assert.assertEquals("Testi geçemedi",20,sonuc);
    }

    @Test
    public void testGetArea2(){

        // nesneyi oluştur, ve verileri hazırla
        Rectangle dikdortgen = new Rectangle();
        dikdortgen.length = 5;
        dikdortgen.width = 4;

        // beklenen yani actual degeri al
        int sonuc = dikdortgen.getArea();   // actual deger yani o anda gelen deger

        // Assert ile karşılaştır
        Assert.assertEquals("Testi geçemedi",22,sonuc);
    }
}
