package Gun58;

public class Borsh implements IFood{

    @Override
    public void taste(){

        System.out.println("Borsh");
    }
    @Override
    public double ucret(){

        return 0;
    }
    public void boil(){

        System.out.println("Kaynatılmış");

    }
    public void eatTomorrow(){

        System.out.println("bir gun dinlendirilmiş olarak");
    }
}
