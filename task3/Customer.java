import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args) {
        BankService myBankService = new BankService();
        // int mySaving=myBankService.createNewAccount("chequing",new BigDecimal(500));
        int mySaving = myBankService.createNewAccount("savings",
                new BigDecimal(500.00));
        Savings sav=new Savings(new BigDecimal(500.00));
        sav.deposit(new BigDecimal(100));

        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));

    }
}
