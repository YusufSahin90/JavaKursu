package Gun53.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {

        // bir interface den bir çok calss implemente eidlebilr.

        Cember cember = new Cember();
        Dikdortgen dd = new Dikdortgen();

        cember.ciz();
        dd.ciz();

        // interface lerden nesne uretileme fakat referans tipi oluşturulabilir.
        // bu bieze polymorpism sagladı.
        ICizilebilir cember2 = new Cember();
        cember2.ciz();
    }
}
