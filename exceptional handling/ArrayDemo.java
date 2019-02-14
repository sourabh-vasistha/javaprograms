import java.util.*;
class ArrayStack
{
	
	Scanner x=new Scanner(System.in);
	int i=0;
	int index=0;
	int arr[]=new int[5];
	void push()
	{
	  for(i=0;i<arr.length;i++)
	  {
	    System.out.println("pleas enter the element"+i+1);
	    arr[i]=x.nextInt();
	    throw new 
	    ArrayIndexOutOfBoundsException();
	  }
	}
	void pop()
	{
		index=arr.length;
		index=i-1;
		for(i=0;i<index;i++)
		{
			System.out.println(arr[i]);
			throw new 
			ArrayIndexOutOfBoundsException();
		}
	}
	void isEmpty()
	{
	   for(i=arr.length-1;i>0;i--)
	   {
	      if(i==0)
	      {
	         throw new
	         ArrayIndexOutOfBoundsException();
	      }
	   }
	}
	void isFull()
	{
	   if(i==arr.length)
	   {
	     throw new
	     ArrayIndexOutOfBoundsException();
	   }
	}
}
class ArrayDemo extends ArrayStack
{
	public static void main(String args[])
	{
      ArrayStack s=new ArrayStack();
      s.push();
      s.pop();
      try
      {
        s.isEmpty();
        s.isFull();
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Exception is"+e);
      }
	}
}

