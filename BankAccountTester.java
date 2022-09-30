public class BankAccountTester
{
    public static void main (String[] args)
    {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(400);
        bankAccount.withdraw(500);

        System.out.println(bankAccount.getBalance());
        System.out.println("Expected: 100");

        BankAccount momsSaving = new BankAccount(1000);
        momsSaving.addInterest(10);

        System.out.println(momsSaving.getBalance());
        System.out.println("Expected: 1100");
    }
}