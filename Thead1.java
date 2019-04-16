class Hi
{
	public void m()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
		}
	}
}
class Hello
{
	public void m()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
	}
}
public class Thread1
{
	public static void main(String[] args)
	{
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.m();
		obj2.m();
	}
}