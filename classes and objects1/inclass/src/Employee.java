import java.util.Scanner;

class Employee
{
    String firstname, lastname;
    double xsalary, ysalary;

    static Scanner a=new Scanner(System.in);

     Employee() 
    {
        firstname="rohan";
        lastname="singh";
        xsalary=70000;
        ysalary=12*xsalary; 
    }

    Employee(String firstname, String lastname, double xsalary)
    {
        this.firstname=firstname;
        this.lastname=lastname;

        while(xsalary<0)
        {
            System.out.println("Entered value is -ve. Please enter the monthly salary again: ");
            xsalary=a.nextInt();
        }
        this.xsalary=xsalary;
        ysalary= 12*xsalary;
    }

    double salRaise()
    {
        ysalary=(12*xsalary*1.1);
        return ysalary;
    }

    void display()
    {
        System.out.println("Employee Information");
        System.out.println("First Name: " +firstname);
        System.out.println("Last name: " +lastname);
        System.out.println("Monthly Salary: "+xsalary);
        System.out.println("Annual Salary (After 10% raise): " +ysalary);
    }
}