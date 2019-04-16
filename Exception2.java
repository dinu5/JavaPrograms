public class Exception2
{
	public static void main(String[] args)
	{
		int i=5;
		try
		{
			if(i<10)
				throw new MyException("This is my own Exception");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
