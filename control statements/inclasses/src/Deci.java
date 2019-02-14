import java.util.Scanner;

class Deci
{
	public static void main(String args[])
	{
	double a, b, c, d;
	int x, y;
		
	Scanner x = new  Scanner(System.in);
	
	System.out.println("Enter two real numbers: ");

		a = scan.nextDouble();
 	    b = scan.nextDouble();
 	    c = 1000.0*a;
 	    d = 1000.0*b;
 	    x = (int) c;
 	    y = (int) d; 
 	    
 	    if (x>y || x<y)
 	    {
 	      System.out.println("The  numbers are not equal till third decimal");
 	    } 
 	    else
 	    {
 	    	System.out.println("The  numbers are equal till third decimal place");
 	    }
	}
}