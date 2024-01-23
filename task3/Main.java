
public class Main {
    public static void main(String[] args) {
        System.out.println();
        BankService bankService = new BankService();

        //saving account create 
        int SavingAccount = bankService.createNewAccount("saving", 6000);
        int SavingAccountBalance = bankService.showBalance(SavingAccount);
        System.out.println(" Saving Account Balance is: " +SavingAccountBalance);

        //investment account 
        int InvestmentAccount = bankService.createNewAccount("investment", 2000);
        int InvestmentAccountBalance = bankService.showBalance(InvestmentAccount);
        System.out.println(" Investment Account Balance is: " +InvestmentAccountBalance);

        System.out.println();

        
        bankService.transferMoney(InvestmentAccount, SavingAccount, 500);
        InvestmentAccountBalance = bankService.showBalance(InvestmentAccount);
        SavingAccountBalance = bankService.showBalance(SavingAccount);
        System.out.println("After Transfer,  Saving Account Balance is: " + SavingAccountBalance);
        System.out.println("After Transfer,  Investment Account Balance is: " + InvestmentAccountBalance);

        //above code is enough for marks 9 ^^

        System.out.println();
        bankService.deposit(SavingAccount, 3000);
        SavingAccountBalance = bankService.showBalance(SavingAccount);
        System.out.println("After Deposit,  Saving Account Balance is: " +SavingAccountBalance);
    }
}