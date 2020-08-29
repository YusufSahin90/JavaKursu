package Gun55.Tasks.task2;

public class Dikdortgen extends sekil {

    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik){

        super();   //  bu bolum bos constructor ı isaret ediyor yazlmasa da extend de oludug icin,
        // burda da constructor var ise mutlaka kulanılması gerekiyor. Bos olan icin yazılmasa da olur,
        // ancak super class da bunun karsılıgı olmak zorunda.
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }


    @Override
    public double alan(){

        return this.uzunluk * this.genislik;
    }

    @Override
    public double cevre(){

        return(this.uzunluk + this.genislik) * 2;
    }
}
