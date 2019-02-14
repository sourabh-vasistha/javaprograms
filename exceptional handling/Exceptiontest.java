
import java.util.*;
class Exceptiontest
{
	public static void main()
	{
	  try
	  {
        int x,y;
        int z;
        x=50;
        y=0;
        z=x/y;
	  }
	  catch(ArithmeticException e)
	  {
	     System.out.println("the exception is "+e);
	  }
	}



	{
		try
		{int a[]=new int[10];
		a[20]=50;}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the exception is "+e);
		}
	



	
	{
		try
		{
          String s="deepanshu";
          int y=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
           System.out.println("the exception is "+e);
		}
	}
	     try
	     {
	     	String s=null;
	     }
	     catch(NullPointerException e)
	     {
            System.out.println("the exception id"+e);

	     }


         try
         {
            String s=new String();
            Scanner x=new Scanner(System.in);
            s=x.next();
            if(s.equals("null"))
            	throw new IoException("NO input");
         }
         catch(IoException e)
         {
         	System.out.println("the exception is"+e);
         }

}
}