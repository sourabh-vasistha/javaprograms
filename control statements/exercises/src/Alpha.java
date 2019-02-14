import java.util.Scanner;
class Alpha
{
    public static void main(String args[ ])
    {
    int i=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the character"); 
    char c=input.next( ).charAt(0);    
    switch(c)
    {
     case 'a' :
     case 'e'  :
     case 'i'  :
     case 'o'  :
     case 'u'  :
     case 'A' :
     case 'E'  :
     case 'I'  :
     case 'O'  :
     case 'U'  :
     i++;
    }
    if(i==1)
    {
    System.out.println("Entered character '+c' is  vowel");}
    else
    { 
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
        System.out.println("character entered '+c' is consonant");
        else
        System.out.println("Not an alphabet");  }    
    }
} 