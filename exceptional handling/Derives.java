import java.util.*;
iport java.io*;
class Base
{
	Base throws IOException
	{
	throw new IOException();

	}
}
class Derives extends Base
{
	Derived throws IOException
	{
	super();
	}
	try
	{
	super();

	}
	catch(IOexecption e)
	{
	  System.out.println("we have exception from the");
	}

}
public static void main(String args[])
{
	try
	{
	Derives x=new Derives();
	}
	catch(Exception e)
	{
	System.out.println("caught IOException");
	}
}