
public class Investment implements IAccount{
    private final int accountNumber;
    private int balance;
    public Investment(int accountNumber, int initAmount)
    {
         this.accountNumber = accountNumber;
         this.balance = initAmount;
        //System.out.println("Investement Account Number is: " +accountNumber);
    }

    @Override
    public void deposit(int amount) {
        balance +=amount;
        //System.out.println("Money Deposited to account number: " +accountNumber + "  and the ammount is: " + balance);

    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        toAccount.deposit(amount);
        balance -=amount;
        //System.out.println("Money transfered from account Number: " +accountNumber + "  and the ammount is: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        balance -=amount;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public int showBalance(){
        return  balance;
    }
}