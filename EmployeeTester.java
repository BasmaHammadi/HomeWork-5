public class EmployeeTester
{
    public static void main (String[] args)
    {
        Employee e1 = new Employee("Basma", 50000);
        Employee e2 = new Employee("Rana", 65000);
        e1.raiseSalary(10);
        e2.raiseSalary(15);
        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());
        System.out.println("Employee Salary after 10% Raise: " + e1.getSalary());

        System.out.println("Employee Name: " + e2.getName());
        System.out.println("Employee Salary: " + e2.getSalary());
        System.out.println("Employee Salary after 15% Raise: " + e2.getSalary());
    }
}
