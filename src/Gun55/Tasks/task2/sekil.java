package Gun55.Tasks.task2;

public abstract class  sekil {

    private String name;

    public sekil(String name){

        setName(name);

    }
    public sekil(){

        System.out.println("kullanılıyor");

    }

    public  String getName(){

        return name;

    }
    public void setName(String name){

        this.name = name;
    }

abstract  double alan();
abstract double cevre();

    @Override
    public String toString() {
        return "ismi= " + this.name +
                "\nAlan = " + Math.round(this.alan()) +
                "\nCevre= " + Math.round(this.cevre());


    }

    // 2. yazdırma yöntemi printf ile
    public String toString2() {
        String formatliCevre = String.format("%6.2f", this.cevre());
        // toplam 10 hane noktadan sonra ise 2 hane
        // - ise sola dayalı yazar.
//        String formatliCevre = String.format("%-10.2f", this.cevre());   // bu şekilde de noktadan sonra 2 hane yazıyor.


        return "ismi= " + this.name +
                "\nAlan = " + Math.round(this.alan()) +
                "\nCevre= " + formatliCevre;
    }




    public void ciz(){

        System.out.println(this.name + " cizildi...");
    }
}





