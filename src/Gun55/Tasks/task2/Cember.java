package Gun55.Tasks.task2;

public class Cember extends sekil {

    private double yaricap;

    public Cember(double yaricap){

        setYaricap(yaricap);
    }

    public double getYaricap(){

        return yaricap;
    }
    public void setYaricap(double yaricap){

        this.yaricap = yaricap;
    }


    @Override
    double alan() {
        // pi * r * r
        return Math.PI * yaricap * yaricap;
    }

    @Override
    double cevre() {
        // 2 * pi * r
        return 2 * Math.PI * yaricap;
    }
}
