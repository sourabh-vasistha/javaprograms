import java.util.Scanner;
class Stack
{
	int ar[]=new int [10];
	int top;
	void push(int num)
	{
	   if(isfull())
	   {
	   System.out.println("no cannot be entered");
	   }
	   else
	   {
	    top++;
	     ar[top]=num;

	   }

	}
	Stack()
	{
	  top=-1;
	}
	void pop()
	{ 

      if(is empty())
      {
      System.oout.pritln("Stack is empty");

      }
      else
      {
      System.out.println(a[top]);
        top--;
        System.out.println("element deleted");
      }
	}
	
	


	
	 boolian isfull()
	{
       if(top==9)
       
       {return true;}
       else
       return false;
	}
	boolian isempty
	if(top==-1)
	{
       
	}

int spaceleft()

	{
	int l;
	k=9-top;
	return(k);	} 
}
class StackTest
{
	public static void main(Strings arg[]);

	{
	int choice , num;
	Scanner s1=new Scanner(System.in);
	Stack S=new Stack();
	System.out.println("enter 1 for push\n");
                                        System.out.println(2 for pop\n);
                                        System.out.println("3 for isempty\n");
                                        System.out.println("4 for isfull\n");
                                        	System.out.println("5 for isspaceleft/");
choice=s1.nextInt();
int r=1;
do{
switch(choice)
{
	case1:
	{System.out.println("enter the no you want to enter to stack");
	num=x.nextInt();
	S.push(num);}
	break;
	case2:
	{
	S.pop();
	}
	break;
    case3:
    {
     S.ismpty();
    }
    break;
    case4:
    {
      S.isfull;
    }
    break;
    case5:
    {
      isspaceleft();
    }
     break;
     default
     {
     System.out.println("entered choice is wrong");

     }
     System.out.println("if you want to continue press 1 or press 2 ");
     r=s1.nextIntln();
     }
     while(r==1);
}

	}

}