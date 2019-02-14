import java.util.Scanner;

class Date
{
    int day, month, year;

    Date()
    {
        day=1;
        month=1;
        year=2000;
    }

    Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    void displayDate()
    {
        System.out.print("The date is: "+ day + "/" +month+ "/" +year);
    }
}

class DateTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int day, month, year, d, m;

        System.out.println("Enter the day: ");
        d=sc.nextInt();

        if (d>=1 && d<=31)
            {
                day=d;
            }
        else
            {
                System.out.println("Error: Day not between 1-31. Please re-enter the day: ");
                d=sc.nextInt();
            }

        System.out.println("Enter the month: ");
        m=sc.nextInt();

        if (m>=1 && m<=12)
            {   
                month=m;
            }
        else
            {
                System.out.println("Error: Month not between 1-12. Please re-enter the month: ");
                m=sc.nextInt();
            }

        System.out.println("Enter the year: ");
        year=sc.nextInt();

        Date dt= new Date(day, month, year);
        dt.displayDate();
    }
}
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
