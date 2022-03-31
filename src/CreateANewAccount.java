public class CreateANewAccount {
    AccountList accountList = new AccountList();
    public void CreateAccount(int accountNumber,double balance, String currencyType ){
        Account account = new Account(accountNumber,balance,currencyType);
        accountList.addList(account);
    }
}
