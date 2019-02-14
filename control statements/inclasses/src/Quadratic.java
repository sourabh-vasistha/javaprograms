import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	public static void main(String args[])
	{
	
	double a;
	double b;
	double c;
	double d;
	double g;
	double e1;
	double f1;
	Scanner x= new Scanner(System.in);
	System.out.println("Enter the values of a,b,c");
	a=x.nextDouble();
	b=x.nextDouble();
	g=x.nextDouble();
	d=(b*b)-4*a*g;
	if(d>0)
	{

	e1=Math.sqrt(((b*b)-4*a*g)/2*a);
	f1=Math.sqrt(-((b*b)-4*a*g)/2*a);

	
	System.out.println("root is" +e1);
	System.out.println("root is" +f1);
}
	if(d<0)
	{
	System.out.println("roots does not exist");

	}
	
}
}


	
