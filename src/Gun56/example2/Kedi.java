package Gun56.example2;

public class Kedi extends Hayvan{

    static int sayac = 0;

    Kedi(){

        sayac++;
        setId();
    }

    @Override
    public void yiyecegi(){

        System.out.println("mama veya balık");
    }
    @Override
    public void yemeMiktari(){

        System.out.println("100 gr");
    }
    @Override
    public void gunlukUykuSuresi(){

        System.out.println("10 saat");
    }
    @Override
    public void sesi(){

        System.out.println("miyav");
    }
}
