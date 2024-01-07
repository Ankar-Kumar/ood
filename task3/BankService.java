import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    private int nextAccountNumber;
    public BankService()
    {
        this.bankAccounts = new Hashtable<>();
        this.nextAccountNumber = 0;
    }

    public int createNewAccount(String type, int initAmount)
    {
        IAccount newAccount = null;
        nextAccountNumber +=1;
        switch (type.toLowerCase())
        {
            case "chequing":
                newAccount = new Chequing(nextAccountNumber, initAmount);
                break;
            case "saving":
                newAccount = new Saving(nextAccountNumber, initAmount);
                break;
            case "investment":
                newAccount = new Investment(nextAccountNumber, initAmount);
                break;
            default:
                System.out.println("Invaild Account type");
                break;
        }

        if(newAccount != null)
        {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, int amount)
    {
        IAccount toAccount = bankAccounts.get(to);
        IAccount fromAccount = bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }

    public void deposit(int accountNumber, int amount)
    {
        IAccount account = bankAccounts.get(accountNumber);
        account.deposit(amount);
    }

    public void withDraw(int accountNumber, int amount)
    {
        IAccount account = bankAccounts.get(accountNumber);
        account.withdraw(amount);
    }

    public int showBalance(int accountNumber)
    {
        IAccount account = bankAccounts.get(accountNumber);
        int currentBalance = account.showBalance();
        return currentBalance;
    }
}