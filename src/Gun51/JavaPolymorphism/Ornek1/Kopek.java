package Gun51.JavaPolymorphism.Ornek1;

public class Kopek extends Hayvan {

    public Kopek(String name){
        super(name);
    }

    @Override
    public void ses(){

        System.out.println("havladi...");
    }

    public void kokladi(){

        System.out.println("kopek kokladi...");
    }
}
