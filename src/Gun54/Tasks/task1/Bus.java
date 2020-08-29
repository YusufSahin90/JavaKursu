package Gun54.Tasks.task1;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "her 1000 km'de dizeli doldur";
    }

    @Override
    public String drive() {
        return "Yavaş sür, yolcuları rahatız etme";
    }
}
