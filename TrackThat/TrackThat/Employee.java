import java.util.Scanner;
public class Employee
{
    private static String first, last, position;
    private static double hourlyRate;
    public Employee(String firstName, String lastName, String position, double hourlyRate)
    {
        this.first = firstName;
        this.last = lastName;
        this.position = position;
        this.hourlyRate = hourlyRate;
    }
    public double getSalary(double hours)
    {
        return(hourlyRate * hours);
    }
    public void setSalary(double rate)
    {
        this.hourlyRate = rate;
    }
    public String getName()
    {
        return(this.first + " " + this.last);
    }
    public String getPosition()
    {
        return(this.position);
    }
     public void setPosition(String position)
    {
        this.position = position;
    }
    public String fire()
    {
        hourlyRate = 0.0;
        return("You have now fired " + first + " " + last);
    }
    public String toString()
    {
        return("Your employee " + this.first + " " + this.last + " has an hourly rate of $" + this.hourlyRate + " and holds the psoition of " + this.position);
    }
}
