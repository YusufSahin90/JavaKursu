package Gun48.Extends3;

public class GenelMudur extends Calisan {

    double tazminat;

    public GenelMudur(String ismi, double maas, int maasKatsayisi, double tazminat) {

        super(ismi, maas, maasKatsayisi);
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {

        return super.maas * super.maasKatsayisi * this.tazminat;

        // bu şekilde de yazabiliriz.
       //   return super.maas * super.maasHesapla() * this.tazminat;

    }

    @Override
    public String toString() {

        return super.toString() + " " + this.tazminat;
    }
}
