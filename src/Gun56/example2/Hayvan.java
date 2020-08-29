package Gun56.example2;

import java.time.LocalDate;

public abstract class Hayvan {

    static int sayac = 0;


    private String name;
    private boolean vahsi;
    LocalDate dogumTarihi;
    private int id;

    abstract void yiyecegi();
    abstract void yemeMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    Hayvan(){

        sayac++;
        setId();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Hayvan.sayac;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id + "\n" +
                "name='" + name + "\n" +
                "vahsi=" + vahsi + "\n" +
                "dogumTarihi=" + dogumTarihi +
                '}';
    }
}
