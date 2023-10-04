import java.math.BigDecimal;

public interface IAccount {
    public void deposite(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount toAccount,BigDecimal amount);

    public int getAccountNumber();
}
