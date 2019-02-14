import java.util.Scanner;
class Arr2
{
	public static void main(String args[])
	{
		int m, n, v, i;

		Scanner x = new Scanner(System.in); 
		int ar[] = new int [5];

		System.out.println("Enter five numbers");
		
		for ( i = 0; i < 5;)
		{
			m = x.nextInt();
			if (m < 10 || m > 100)
				{
					System.out.println(" entered number is invalid.");
			        continue;
			    }    
			else
			    {
				    ar[i] = m;
			     	i++;
			    } 
			
		}	
		for (n = 0; n < 5; n++)
		{
			for (v = 0; v < n; )
			if (ar[v] == ar[n])
				{
					v++;
				}
			else 
			    {
				System.out.println(ar[v]);
				v++;
			    }	
 
		}

	}