package Gun58;

public class AdanaKebap implements IFood {


    @Override
    public void taste(){

        System.out.println("Lezzetli, Taze, 10 numara 5 yıldız");
    }
    @Override
    public double ucret(){

        return 5;
    }
    public void marinade(){

        System.out.println("marine edilmiş");
    }
    public void grill(){

        System.out.println("Mangalda AdanaKebap");
    }

}
