package Gun48.task2;

public class Sekil {

    // Sekil
    // Cember
    // Dikdortgen
    // Kare

    @Override
    public String toString(){

        return "Sekil : Bilgi yok";
    }
    public double getAlan(){

        throw new RuntimeException("Bu sınıfın bu method özelligi yoktur.");
    }
    public double getCevre(){

        throw new RuntimeException("Bu sınıfa bu method implemente(entegre) edilmemiştir.");
    }
}
