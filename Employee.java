public class Employee
{
    private String name;
    private double salary;

    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = byPercent / 100.0;
        salary = (salary * raise) + salary;
    }
}
