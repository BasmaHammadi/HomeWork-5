public class BankAccount
{
    private double balance;
    private double interestRate;
    public BankAccount()
    {
        balance = 0;
    }
    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void addInterest(double rate)
    {
        interestRate = rate / 100.0;
        balance = (balance * interestRate) + balance;
    }
}