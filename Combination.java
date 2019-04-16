import java.util.Scanner;
public class Combination
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	public static void main(String[] args)
	{
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number for position n");
		n=sc.nextInt();
		System.out.println("Please enter a number for position r");
		r=sc.nextInt();
		int nCr=factorial(n)/(factorial(n-r)*factorial(r));
		int nPr=factorial(n)/factorial(r);
		System.out.println("nCr= "+nCr);
		System.out.println("nPr= "+nPr);
	}
		
}