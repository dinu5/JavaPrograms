import java.util.Scanner;

public class CountVowels
{
	public static void main(String[] args)
	{
		int vowels=0;
		int consonents=0;
		int spaces=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		char[] c=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' )
			{
				vowels=vowels+1;
			}
			
			else if(c[i]==' ')
				spaces=spaces+1;
			
			else
				consonents=consonents+1;
		}
		
		System.out.println("Vowels = " +vowels);
		System.out.println("consonents = " +consonents);
		System.out.println("spaces = " +spaces);
	}
}