import java.util.Scanner;
class Arr1
{
	public static void main ary()
	{
		int x, i, y;

		Scanner scan = new Scanner(System.in); 
		int ar[] = new int [5];

		System.out.print("Enter the number of elements of array");
		x = scan.nextInt();

		System.out.println("Enter the elements of array");
		for ( i = 0; i < x; i++)
		{
			ar[i] = scan.nextInt();
		}	
		for (y = 0; y < x; y++)
		{
			System.out.println(y + "The element of the array is" + ar[y]);
		}

	}

	
		public static void main(String args[])
		{
			ary();
		}
	}