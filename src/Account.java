public class Account implements IAccount  {
    public int accountNumber;
    public double balance;
    public String currencyType;

    public Account(int accountNumber, double balance, String currencyType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }
    public void addANewMethod(){
        System.out.println("This is for check github");
    }
    public double GetBalanceInfo(){
        return balance;
    }
// is it in Seccond Branch or Not


}
