package Gun51.finalMethod;

public class Araba extends Tasit {
    public Araba(String model){
        super(model);
    }

//    @Override
//    public String toString(){
//        return getModel();
//    }

    // yazdırma methodu toString final tipinde
    // oldugundan override edilemez yani degistirilemez.
}
