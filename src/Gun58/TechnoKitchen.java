package Gun58;

public class TechnoKitchen{
    public static void Kochen(IFood foods){

        System.out.println("***** " + foods.getClass().getSimpleName() + " hazırlanıyor..." + " *****");

        if(foods instanceof AdanaKebap){

            foods.taste();
            ((AdanaKebap) foods).marinade();
            ((AdanaKebap) foods).grill();

        }else if(foods instanceof Lahmacun){

            foods.taste();
            ((Lahmacun) foods).dough();
            ((Lahmacun) foods).topping();
            ((Lahmacun) foods).addMeat();
            ((Lahmacun) foods).bake();

        }else if(foods instanceof Palov){

            foods.taste();
            ((Palov) foods).fry();
            ((Palov) foods).boil();

        }else if(foods instanceof Borsh){

            foods.taste();
            ((Borsh) foods).boil();
            ((Borsh) foods).eatTomorrow();
        }
    }
}
