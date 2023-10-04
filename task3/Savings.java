import java.math.BigDecimal;

class Savings implements IAccount {
    private static int nextAccountNumber = 1;
    private int accountNumber;
    private BigDecimal balance;

    Savings(BigDecimal initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            ((Savings) toAccount).balance = ((Savings) toAccount).balance.add(amount);
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
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