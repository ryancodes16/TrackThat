import java.util.Scanner;
/**
 * Intializes the employee program
 * 
 * @author Ryan 
 * @version 1.1
 */
public class Driver
{
    private static String companyName;
    private static int numEmployees;
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your company");
        companyName = scan.nextLine();
        System.out.println("Enter the number of employees");
        numEmployees = scan.nextInt();
        Company comp = new Company(companyName, numEmployees);
        
        
        //testing stuff
        System.out.println(comp.getName());
        comp.addEmployee("Ryan", "Smith", "IT support", 25.0);
        comp.getPayday(3);
        comp.fireEmployee("Ryan", "Smith");
        System.out.println(comp.getCompSize());
    }
}
