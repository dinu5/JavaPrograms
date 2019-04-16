public class Palindrome1
{
	public static void checkPalindrome(String s)
	{
		String reverse=new StringBuffer(s).reverse().toString();
		if(s.equals(reverse))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static void main(String[] args)
	{
		checkPalindrome("malayalam");
		checkPalindrome("dinu");
	}
}