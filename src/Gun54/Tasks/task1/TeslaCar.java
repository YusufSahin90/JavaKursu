package Gun54.Tasks.task1;

public class TeslaCar extends Vehicle implements IElectric{


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery(){

        return "10 yıl da bir batarya degiştir.";
    }

    @Override
    public String drive(){

        return "hızlı sure, Auto pilot sür";
    }
}
