package Gun59;

public class WellsFargo extends Bank{

    public WellsFargo(String name, String phoneNumber, String address, int numEmployee){
        super(name,phoneNumber,address,numEmployee);
    }


    @Override
    public void openAccount(){

        System.out.println("adınız ve adres bilgileriniz alındı.");
        System.out.println(this.getClass().getSimpleName() + " hesap açılışınız yapıldı.");

    }

    @Override
    public void closeAccount(){

        System.out.println("adınız ve adres bilgileriniz alındı.");
        System.out.println(this.getClass().getSimpleName() + " hesap kapatma işlemi yapıldı.");

    }
}
