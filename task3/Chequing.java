
public class Chequing implements IAccount{

    private final int accountNumber;
    private int balance;
    public Chequing(int accountNumber, int initAmount)
    {
        this.accountNumber = accountNumber;
        this.balance = initAmount;
    }

    @Override
    public void deposit(int amount) {
        balance +=amount;
    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        toAccount.deposit(amount);
        balance -=amount;
    }

    @Override
    public void withdraw(int amount) {
        balance -=(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public int showBalance(){
        return  balance;
    }
}