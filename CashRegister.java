public class CashRegister
{
    private double purchase;
    private double payment;
    private String priceString = "";
    private int salesCount;
    private double salesTotal;
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
        salesCount = 0;
        salesTotal = 0;
    }
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
        String price = String.valueOf(amount);
        priceString = priceString.concat(price + " \n         ");
        salesCount++;

    }
    public void recievePayment(double amount)
    {
        payment = payment + amount;
    }
    public double giveChange()
    {
        salesTotal = salesTotal + purchase;
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    public void printReceipt()
    {
        System.out.println("Reciept:");

        System.out.println("         " + priceString);

        System.out.println("=================");
        System.out.println("Total:   " + purchase);
    }
    public double getSalesTotal()
    {
        return salesTotal;
    }
    public int getSalesCount()
    {
        return salesCount;
    }
}