abstract class Shape
{
	public String color;
	public Shape( String color)
	{
		this.color = color;
	}
	public void details()
	{
		System.out.println("Color :"+color);
	}
	abstract public void printArea();
}
class Circle extends Shape
{
	public static double pi = 3.14;
	public double r;
	public Circle(String color,double r)
	{
		super(color);
		this.r = r;
	}
	public void printArea()
	{
		double area = pi*r*r;
		System.out.println("Area of Circle :"+area);
		details();
	}
}
class Rect extends Shape
{
	public int l;
	public int w;
	public Rect(String color,int l,int w)
	{
		super(color);
		this.l = l;
		this.w = w;
	}
	public void printArea()
	{
		double area = l*w;
		System.out.println("Area of Rect :"+area);
		details();
	}
}
class Tri extends Shape
{
	public  double  b;
	public int h;
	public Tri(String color,double b,int h)
	{
		super(color);
		this.b = b;
		this.h = h;
	}
	public void printArea()
	{
		double area = 0.5*b*h;
		System.out.println("Area of Tri :"+area);
		details();
	}
}
class MainClass5 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle("RED",4.5);
		Rect r1 = new Rect("BLUE",12,4);
		Tri t1 = new Tri("BLACK",15.4,18);
		c1.printArea();
		r1.printArea();
		t1.printArea();
	}
}
