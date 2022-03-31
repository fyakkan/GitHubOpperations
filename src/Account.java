public class Account implements IAccount  {
    public int accountNumber;
    public double balance;
    public String currencyType;

    public Account(int accountNumber, double balance, String currencyType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public double GetBalanceInfo(){
        return balance;
    }



}
