import java.util.Scanner;
public class Exception1
{
	public static void main(String[] args)
	{
		int i,j,k;
		i=10;
		//BufferedReader br=new BufferedReader(InputStreamReader sr=new InputStreamReader(System.in));
		Scanner sc;
		try
		{
		sc=new Scanner(System.in);
		System.out.println("Enter any number");
		j=sc.nextInt();
		k=i/j;
		System.out.println("The result is "+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry, You can not enter zero");
		}
			
	}
}