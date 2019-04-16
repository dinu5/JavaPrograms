import java.util.Scanner;

class StringPalindrom
{
	public static void main(String[] args)
	{
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string ");
		str=sc.nextLine().toLowerCase();
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}
		
		if(rev.equals(str))
			System.out.println("yes");
		else
			System.out.println("No");
	}
}