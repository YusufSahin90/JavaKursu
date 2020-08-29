package Gun39.javaEnum.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        // verilen ay nosuna göre ayın kaç gun oldugunu yazdırınız.
        
        // int sayi = 5;   gibi.
        
        Aylar ay = Aylar.MART;

        System.out.println("ay = " + ay);    //  ay = MART
        System.out.println("ay.name() = " + ay.name());      // ay.name() = MART

        // ay.ordinal() bize MART ayının index ini verdi.
        System.out.println("ay.ordinal() = " + ay.ordinal());   // ay.ordinal() = 2
        
        
        
        
        switch(ay){
            
            case OCAK:
                System.out.println(31);
                break;
                
            case ŞUBAT:
                System.out.println(28);
                break;
                
            case MART:
                System.out.println(30);
                break;
                
            case NISAN:
                System.out.println(31);
                break;
                
            case MAYIS:
                System.out.println(30);
                break;
                
        }
    }
}
