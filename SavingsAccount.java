public class SavingsAccount
{
    private double balance;
    private double interestRate;
    public SavingsAccount(double amount, double percentInterest)
    {
        balance = amount;
        interestRate = percentInterest / 100.0;
    }
    public void addInterest()
    {
        balance = (balance * interestRate) + balance;
    }
    public double getBalance()
    {
        return balance;
    }
}
