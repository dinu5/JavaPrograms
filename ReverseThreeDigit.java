public class ReverseThreeDigit
{
	public static void main(String[] args)
	{
		int userNo=317;
		
		if (userNo>=100 && userNo<=999)
		{
			System.out.println("User number is " +userNo);
			int unidigit=userNo%10;
			userNo=userNo/10;
			int tenthdigit=userNo%10;
			int lastdigit=userNo/10;
			
			int reverseNo= unidigit*100 + tenthdigit*10 + lastdigit;
			
			System.out.println("The reverse number is " +reverseNo);
		}
		
		else
			System.out.println("The number is not three digit");
	}
}