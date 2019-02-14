import java.util.*;
import java.lang.Math;

class Year
{

public static void main(String args[])
{
   int x,y=0;
   Scanner month= new Scanner(System.in);
   do
 {
 	System.out.println("enter the number from 1 to 12");
   y=month.nextInt();

   if((x>=1) && (x<=12))
   {
   switch(x);
   {
   	case 1:
   	System.out.println("Its January");
   	break;
   	case 2:
   	System.out.println("Its February");
   	break;
   	case 3:
   	System.out.println("Its March");
   	break;
   	case 4:
   	System.out.println("Its April");
   	break;
   	case 5:
   	System.out.println("Its May");
   	break;
   	case 6:
   	System.out.println("Its June");
   	break;
   	case 7:
   	System.out.println("Its July");
   	break;
   	case 8:
   	System.out.println("Its August");
   	break;
   	case 9:
   	System.out.println("Its September");
   	break;
   	case 10:
   	System.out.println("Its October");
   	break;
   	case 11:
   	System.out.println("Its November");
   	break;
   	case 12:
   	System.out.println("Its December");
   	break;
   }
}


else{
	System.out.println("The value is incorrect");
}
Scanner enter= new Scanner(System.in);
System.out.println("do you want to continue? 1.Yes 2.No?");
 x=enter.nextInt();

}while(y==1);

}
}


