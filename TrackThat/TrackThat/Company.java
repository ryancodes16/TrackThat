import java.util.Scanner;
import java.util.ArrayList;
public class Company
{
    private static String name;
    private static int employeeNum;
    private static ArrayList<Employee> employees;
    public Company(String name, int employeeNum)
    {
        this.name = name;
        this.employeeNum = employeeNum;
        employees = new ArrayList<>();
    }
    public String getName()
    {
        return(this.name);
    }
    public void addEmployee(String firstName, String lastName, String position, double hourlyRate)
    {
        Employee myEmployee = new Employee(firstName, lastName, position, hourlyRate);
        employees.add(myEmployee);
    }
    public void fireEmployee(String firstName, String lastName)
    {
        for(int i = employees.size() - 1; i >= 0; i--)
        {
            if(employees.get(i).getName().equals(firstName + " " + lastName))
            {
                employees.remove(i);
            }
        }
    }
    public void getPayday(double hours)
    {
        for(int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i).getSalary(hours));
        }
    }
    public int getCompSize()
    {
        return(employees.size());
    }
}
