import java.util.*;
class Operation
{
	public static void main(String args[])
	{
	int n1,n2,sum,diff,multi,remain;
	float divide;
	Scanner x=new Scanner(System.in);
	System.out.println("enter the value");
	n1=x.nextInt();
	System.out.println("enter the value");
	n2=x.nextInt();
	sum=n1+n2;
	diff=n1-n2;
	multi=n1*n2;
	remain=n1%n2;
	divide=n1/n2;
	System.out.println("sum is"+sum);
	System.out.println("difference is"+diff);
	System.out.println("product is"+multi);
	System.out.println("remainder is "+remain);
	System.out.println("quotient is"+divide);

	}
}