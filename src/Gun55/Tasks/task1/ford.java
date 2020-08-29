package Gun55.Tasks.task1;

public class ford extends BinekOto {

    // abstract method oldugundan zorunlu olarak
    // yazılmak zorunda (implemente edildi.)
    @Override
    public String getMarka(){

        return "Ford Focus";
    }

    // abstract class daki yazılmış somut methodları
    // ister oldugu gibi kullanabiliriz.
    // istenirse override yapabiliriz.
    @Override
    public int getUretimYili(){

        System.out.println(super.getUretimYili());
        return super.getUretimYili();

    }
}
