package Gun58;

public class Lahmacun implements IFood {

    @Override
    public void taste(){

        System.out.println("Lezzetli, ince hamurlu");
    }
    @Override
    public double ucret(){

        return 2;
    }
    public void dough(){

        System.out.println("Mayalı hamur hazırlandı.");
    }
    public void topping(){

        System.out.println("Uygun şekilde açıldı.");
    }
    public void addMeat(){

        System.out.println("Etli Lahmacun");
    }
    public void bake(){

        System.out.println("Fırında Lahmacun");
    }
}
