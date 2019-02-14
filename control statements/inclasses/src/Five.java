import java.util.Scanner;

class Five
{
	public static void main(String args[])
	{
	Scanner x=new Scanner(System.in);

	int num;
	int a;
	int b;
	int c;
	int d;
	int e;
	System.out.println("Enter a 5 digit number");
	num=x.nextInt();

	if(num<10000 && num>99999)
		{
			System.out.println("The entered number is not a 5 digit number. Enter the number again");
       		num = x.nextInt();
       	}
    else
    {
		a = num/10000;
		b = (num-10000*a)/1000;
		c= (num-10000*a-1000*b)/100;
		d= (num-10000*a-1000*b-100*c)/10;
		e = (num-10000*a-1000*b-100*c-10*d)/1;}
	     System.out.println( +a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
    }
}