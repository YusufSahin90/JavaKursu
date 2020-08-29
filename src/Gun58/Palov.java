package Gun58;

public class Palov implements IFood {


    @Override
    public void taste(){

        System.out.println("Çocukların vazgeçilmezi");
    }
    @Override
    public double ucret(){

        return 4;
    }
    public void fry(){

        System.out.println("pirinç ve şehriye kavruldu");
    }
    public void boil(){

        System.out.println("haşlama olarak");
    }
}
