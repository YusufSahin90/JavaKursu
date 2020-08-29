package Gun56.example2;

public class Kartal extends Hayvan {

    static int sayac = 0;

    Kartal(){

        sayac++;
        setId();
    }


    @Override
    public void yiyecegi(){

        System.out.println("et");
    }

    @Override
    public void yemeMiktari(){

        System.out.println("3 ogun");
    }

    @Override
    public void gunlukUykuSuresi(){

        System.out.println("5 saat");
    }

    @Override
    public void sesi(){

        System.out.println("ciyak");
    }
}
