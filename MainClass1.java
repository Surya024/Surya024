abstract class A
{
	abstract public void test();
}
class B extends A
{
	public void test()
	{
			System.out.println("test is completed");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
	}
}
