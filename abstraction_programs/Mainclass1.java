abstract class Sample1
{
	abstract public void test1();
}
class Demo1 extends Sample1
{
	public void test1()
	{
		System.out.println("Test is completed");
	}
}
class Run1
{
	public Sample1 getObject1()
	{
		Sample1 s1 = new Demo1();
		return s1;
	}
}
class Mainclass1 
{
	public static void main(String[] args) 
	{
		Sample1 s1 = new Demo1();
		s1.test1();
	}
}
