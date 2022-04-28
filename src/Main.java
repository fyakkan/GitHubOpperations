import java.util.Scanner;

public class Main {
    public static void main(String[]args){



        Scanner scanner = new Scanner(System.in);
        Account selectedAccount = new Account(0,0,null);
        CreateANewAccount createANewAccount = new CreateANewAccount();


        while (true){
            System.out.println(" If you want to create account write 1 " +
                    "\n If you want to trade, write 2 " +
                    "\n if you want to exit to program write 3");
            int selection=scanner.nextInt();


            if (selection==1){

                System.out.println("Enter an account number");
                int accountnumber = scanner.nextInt();
                System.out.println("Please Select your account type (TL or Dollar)");
                String  typeOfCurrency= scanner.nextLine();
                scanner.nextLine();
                System.out.println("Please enter initial balance of Account");
                int balance = scanner.nextInt();
                createANewAccount.CreateAccount(accountnumber,balance,typeOfCurrency);
                

            }
            else if(selection==2){
                System.out.println("Write your account id please.");
                int enteredAccNum=scanner.nextInt();

                // Finding account
                for (Account accountSelection:createANewAccount.accountList.AccountList){
                    if (enteredAccNum==accountSelection.accountNumber){
                        selectedAccount = accountSelection ;


                    }

                }
                Transacitons transacitons = new Transacitons();

                System.out.println("1. Add money");
                System.out.println("2. Withdraw money");
                System.out.println("3. Show my balance");
                int addOrWithdraw= scanner.nextInt();

                if (addOrWithdraw==1){
                    System.out.println("Please enter how much money do you want to add");
                    int amountAddMoney= scanner.nextInt();
                    transacitons.AddMoney(amountAddMoney,selectedAccount);
                    System.out.println(selectedAccount.GetBalanceInfo());
                }
                else if(addOrWithdraw==2) {
                    System.out.println("Please enter how much money do you want to withdraw");
                    int amountWMoney= scanner.nextInt();
                    transacitons.WithdrawMoney(amountWMoney,selectedAccount);
                    System.out.println(selectedAccount.GetBalanceInfo());
                }
                else if (addOrWithdraw==3){
                    System.out.println(selectedAccount.GetBalanceInfo()+" "+selectedAccount.currencyType);
                }



            }
            else {
                System.out.println("This is for push request from 2nd Branch");
                break;
            }


        }



    }
}
