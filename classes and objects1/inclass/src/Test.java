class Circle
{
	double radius;
	String color="red";
Circle()
{
	radius = 0;
}
Circle(double radius)
{
	this.radius=radius;
}
Circle(double radius,String color)
{
	this.radius=radius;
	this.color=color;
}
 public double getradius()
{
	return radius;
}
void setradius(double radius)
{
	this.radius=radius;
}
 string getcolor()
{
	return color;
}
void setcolor()
{
	this.color=color;
}
double getArea()
{
	return(3.14*getRadius()*getColor());

}

}
 class Cylinder extends Circle
{
	double height;
Cylinder()
{
	height=1;
}
Cylinder(double radius)
{
	super(radius);
}
 Cylinder(double radius,double height)
{
	super(radius,color);
	this.height=height;

}
Cylinder(double radius,double height,String color)
{
	super.radius=radius;
	this.height=height;
}
double getheight()
{
	return height;

}
void setheight(double height)
{
	this.height=height;
}
double getvolume()
{
	return(3.14*getheight()*getradius()*getradius());

}
}
class Test
{
	public static void main(String args[])
	{
	Cylinder c1=new Cylinder();
	Cylinder c2=new Cylinder(5);
	Cylinder c3=new Cylinder(5,10);
	Cylinder c4=new Cylinder(5,10,"green"); 
	c1.setradius(10);
	c2.setheight(11);
	V=c1.getvolume();
	A=c1.getArea();
	System.out.println("Volume is"+V);
	System.out.println("Area is"+A);


	}
}









