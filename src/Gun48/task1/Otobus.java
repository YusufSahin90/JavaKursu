package Gun48.task1;

public class Otobus extends Arac {

    int yolcuSayisi;

    public Otobus(String renk, int motor, String model, int yolcuSayisi){

        super(renk,motor,model);
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "renk='" + getRenk() + '\'' +  // private oldugu için direk erişilemez.
                ", motor=" + getMotor() +     // private oldugu için direk erişilemez.
                ", model='" + model + '\'' +  // private oldugu için direk erişilemez.
                "yolcuSayisi=" + yolcuSayisi +
                '}';
    }
}
