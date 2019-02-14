import java.util.Scanner;
class Employee
{
	int total;
	String name[]=new String[total];
	int year[]=new int[total];
	String address[]=new String[total];
	Scanner x=new Scanner(System.in); 

	Employee()
	{
	  total=0;
	  name[0]="deepanshu";
	  address[0]="address";

	}
	Employee(int total)
	{
	  this.total=total;
	  String name[]=new String[total];
	int year[]=new int[total];
	String address[]=new String[total];

	for(int i=0;i<total;i++)
	{
	  System.out.println("enter the name of the user");
	  name[i]=x.next();
	  System.out.println("enter the year of joining");
	  year[i]=x.nextInt();
	  System.out.println("enter the address");
	  address[i]=x.next();

	}

	}
	void display()
	{
	  for(int i=0;i<total;i++)
	  {
	    System.out.println("name[i],year[i],address[i]");
	  }
	}
}
class Employeetest
{
	public static void main(String[] args)
	{
	 Scanner x=new Scanner(System.in);
	 System.out.println("enter the no of user");
	 int total=x.nextInt();
	 Employee e1=new Employee(total);
	 e1.display();
	}
}