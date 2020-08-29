package Gun59;

public abstract class Bank {



    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;

    public Bank(String name, String phoneNumber, String address, int numEmployee){

        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setNumEmployee(numEmployee);

    }


    String withdraw(double gidenPara){

        this.balance -= gidenPara;
        return gidenPara + " Euro çekildi...";
    }

    String deposit(double gelenPara){

        this.balance += gelenPara;
        return gelenPara + " Euro alindi...";
    }

    String loan(){

        return "kredi cekilebilir...";
    }

    public abstract void openAccount();
    public abstract void closeAccount();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + address + '\'' +
                ", numEmployee=" + numEmployee +
                ", balance=" + balance +
                '}';
    }
}

