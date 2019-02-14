
import java.util.*;
class Stack
{  
  int ar[]=new ar[10];
  int top;
  int num;
	Stack()
	{
	  top=-1;
	}
	public boolian isempty()
	{
	  if(top==-1)
	  {
	    return true;
	  }
	  else
	  {
	    return false;
	  }
	}
	public boolian isfull()
	{
	  if(top==9)
	  {
	    return true;
	  }
	  else
	  {
	    return false;

	  }

	}
	public void push(int num)
	{
	  if(isfull())
	 {System.out.println("number cannot be entered");}
	  else
	  { 
	      top++;
	      ar[top]=num;

	  } 

	}
	public void pop()
	{
	   if(isfull())
	   {
	     System.out.println("the stack is empty");
	   }
	   else
	   {
	     System.out.println("element deleted is: ");
	     System.out.println("ar[top]");
	     top--;
	   }
	}
	public  int isspaceleft()
	{
	  int space;
	  space=9-top;
	  return space;
	}
	public void display()
	{
	  for(top=0;top<ar.length;top++)
	  {
	    System.out.println("ar[top]");
	    System.out.println("/t");
	  }
	}
}
class Stacktest
{
	public static void main(String[] args)
	{    
       Scanner scan=new Scanner(System.in);
	  Stack S=new Stack();
	  String ans,y,n;
	  do()
	  System.out.println("choose one of the following operation,isempty-1,isfull-2isfull-2,push-3,pop-4,isspaceleft-5,display-6");
	  int input;
	  int x;
	  input=scan.nextInt()
	  switch(input)
      {
      	case1:
      	S.isempty()
      	
      	break;

      	case2:
      	S.isfull()
        break;
      	case3:
      	System.out.println("enter the no you want to enter in stack");
	      	x=scan.nextInt()
      	S.push(x)
      	break;
      	case4:
      	S.pop()
      	break;

      	case5:
      	S.isspaceleft()
      	break;
      	case6:
      	S.display()
      	break;
      	default:
      	{System.out.println("error:option not found");}
      }

     System.out.println("\nDo you want to continue? Enter y for Yes and n for No: ");
			ans=scan.next()

		while(ans.charAt(0)=='y')
		{


		System.out.println("\nDo you still want to continue? Enter y for Yes and n for No: "); 
		ans=scan.next()
		}

		System.out.println("You have now exited the program.");
      }


  }

	