package Gun48.Extends3;

public class Calisan {

    private String ismi;
    protected double maas;  // bu sınıftan turetilenler ulaşabilir.
    int maasKatsayisi;

    public Calisan(String ismi, double maas, int maasKatsayisi) {
        this.ismi = ismi;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla() {

        return this.maas * this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + ismi + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }
}
