package Gun47.task2;

public class Account {

    // fields

    int accountNumber;  // hesap no
    private double balance;  // bakiye

    public static int Number = 1;  // otomatik verilecek sayac

    public Account() {

        this.accountNumber = Number;

    }

    public void deposit(double incomeMoney) {  // gelen para

        this.balance += incomeMoney;

    }

    public void withdraw(double outcomeMoney) {  // giden para

        if(outcomeMoney > 5000){

            throw new RuntimeException("Gunluk limiti aştınız...");
        }

        if (outcomeMoney > this.balance) {

            throw new RuntimeException("Yetersiz bakiye...");
        }
        this.balance -= outcomeMoney;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getNumber() {
        return Number;
    }

    public static void setNumber(int number) {
        Number = number;
    }
}




