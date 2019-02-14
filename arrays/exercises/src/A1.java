import java.util.*;
Class A1 {
    
    Scanner x = new Scanner(System.in);

    public static void main(String args[])

    {
        int a, i, j, row, col;

        System.out.println("Enter the number of rows");


        row=x.nextInt();

        System.out.println("Enter the number of columns");
        col = x.nextInt();

        int ar1[][]= new int[r][c];

        for ( i = 0; i < row; i++)
        {
            for ( j = 0; j < col; j++)
            {
                System.out.println("Enter a two digit number");
                a = x.nextInt();

                for(; ;)
                {
                    if (a >= 10 && a <= 99)
                    {
                        x[i][j] = a;
                        break;
                    }
                    else
                    {
                        System.out.println(" Number is not 2-digits. Enter the number again : ");
                        a = x.nextInt();
                    }
                }

            }

        }

        System.out.println("Entered array : ");
        for (i=0;i<r;i++)
        {
                System.out.println(Arrays.toString(x[i]));
        }
        System.out.println("Array after multiplying each odd element by 2 : ");
        for (i=0;i<r;i++)
        {
            for (j=0;j<r;j++)
            {
                if(y[i][j]%2 ==0 )
                    continue;
                else
                    y[i][j]*=2;
            }
        }
        for (i=0;i<r;i++)
        {
            System.out.println(Arrays.toString(y[i]));
        }

    }
    }