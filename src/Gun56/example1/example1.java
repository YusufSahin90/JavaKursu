package Gun56.example1;

class C {
    public C(){

        System.out.println("C");
    }
}

class B extends C{
    public B(){
        // super();   yandaki method yazılsa da yazılmasa da önce super Constructor cagrılıyor.
        System.out.println("B");
    }
}
class A extends B{
    public A(){
        // super();   yandaki method yazılsa da yazılmasa da önce super Constructor cagrılıyor.
        System.out.println("A");
    }
}
public class example1{
    public static void main(String[] args) {

        A a = new A();
    }
}
