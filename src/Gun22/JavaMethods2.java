package Gun22;

public class JavaMethods2 {
    public static void main(String[] args) {

        merhabaYaz();
        merhabaYaz();
        ismeMerhabaYaz("ismet");
        ismeMerhabaYaz("Ayşe");

    }

    public static void merhabaYaz(){

        System.out.println("Merhaba");
    }

    public static void ismeMerhabaYaz(String ad){

        System.out.println("Merhaba " + ad);
    }
}
