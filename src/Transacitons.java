public class Transacitons  {

    public void AddMoney (double amount,Account account){
        account.balance =account.balance+amount;
    }
    public void WithdrawMoney(double amount,Account account){
        account.balance =account.balance-amount;
    }

}
