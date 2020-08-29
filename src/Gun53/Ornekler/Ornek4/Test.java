package Gun53.Ornekler.Ornek4;

public class Test implements IGoster, IYazdir {

    @Override
    public void goster(){
        System.out.println("goster");
    }

    // implemente edilen interfacler e aynı isim ve parametrede
    // olan methodlardan bir tane yazmak yeterlidir.
    // problem oluşturmaz.

    @Override
    public void yaz(){
        System.out.println("goster yaz");
    }
}
