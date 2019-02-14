
class CheckArgException extends Exception
{
   CheckArgException()
   {
    super ();
   }
}
class Command
{
	public static void main(String args[])
	{
	  int a[]=new int[5];
	  try
	  {
	    int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	       a[i]=Integer.parseInt(args[i]);
	       count++;
	      
	   }
	    if(count!=5)
	    throw new CheckArgException();
	       

	  }
	  catch(Exception e)
	       {
	       	System.out.println("exception is"+e);
	       }
	}

}