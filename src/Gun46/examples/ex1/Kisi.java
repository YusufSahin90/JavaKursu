package Gun46.examples.ex1;

public class Kisi {

    String ad;
    String soyad;
    private int yas;

    // setter method,  // sag tık, Generate seçip ordan seçebiliyoruz.
    public void setYas(int yas) {

        this.yas = Math.abs(yas);

        // 2. yöntem

//        if(yas > 0) {
//
//            this.yas = yas;

//        }else{

//            this.yas = yas;
//        }

    }

    // getter method,  // sag tık, Generate seçip ordan seçebiliyoruz.
    public int getYas(){

        return this.yas;
    }
}
