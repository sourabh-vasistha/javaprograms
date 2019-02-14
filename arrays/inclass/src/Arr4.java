import java.util.Scanner;
class Arr4
{
	public static void main(String args[])
	{
		int a, b, i, j, k, l;

		Scanner x = new Scanner(System.in); 

		int arr1[] = new int [10];
		int arr2[] = new int [10];

		System.out.print("Enter the number of rows for first and second array");

		a = x.nextInt();
		b = x.nextInt();
        System.out.println("Enter the elements of the first array:");

		for (i = 0; i < a; i++)
		{
			arr1[i] = x.nextInt();
		}

		System.out.println("Enter the elements of the second array:");

		for (j = 0; i < a; i++)
		{
			arr2[i] = x.nextInt();
		}	
		
		for (k = 0; k < 5; k++)
		{
			for (l = 0; l < k; )
			{
			if (arr1[l] == arr1[k])
				{
					l++;
				}
			else 
			    {
				System.out.println(arr1[l]);
				l++;
			    }	
			}
		}

	}
}

