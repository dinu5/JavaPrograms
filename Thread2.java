class Counter
{
	int count;
	public void increment()
	{
		count++;
	}
}
public class Thread2
{
	public static void main(String[] args)
	{
	Counter c=new Counter();
	Thread t=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
					c.increment();
			}
		});
		
	}
}