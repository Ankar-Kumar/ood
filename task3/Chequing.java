import java.math.BigDecimal;

public class Chequing implements IAccount {
    private int accountNumber;
    private BigDecimal balance;
    private static int nextAccountNumber = 1;

    Chequing(BigDecimal initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }
    
    public void transfer(IAccount toAccount, BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            ((Chequing) toAccount).balance = ((Chequing) toAccount).balance.add(amount);
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }
    public int getAccountNumber(){
        
        return accountNumber;
    }
    
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void deposite(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposite'");
    }

}
