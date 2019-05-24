import java.util.Scanner;
//import java.util.Character;
//import java.util.

public class PasswordChecking{
	
	public static void main(String[] args)
	{
		int min=8;
		int max=12;
		int digit=0;
		int upCount=0;
		int loCount=0;
		int special=0;
		String password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password ");
		password=sc.nextLine();
		
		if(password.length()>=min && password.length()<=max)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
				if(Character.isUpperCase(c))
					upCount++;
				if(Character.isLowerCase(c))
					loCount++;
				if(Character.isDigit(c))
					digit++;
				if(c>=33&&c<=46 || c==64)
					special++;
			}
			
			if(upCount>0 && loCount>0 && special>0 && digit>0)
				System.out.println("Password is good ");
			else
				System.out.println("Invalid Password ");
		}
		
		if(password.length()<min)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
				if(Character.isLowerCase(c))
					loCount++;
				if(Character.isUpperCase(c))
					upCount++;
			}
			if(loCount>0 && upCount==0){
				System.out.println("Password have to contain atleast " +min+" characters");
				System.out.println("There should be atleast one Upper case");
				System.out.println("There should be atleast one Digit");
				System.out.println("There should be atleast one Special chracter");
			}
		}
		if(password.length()<min && upCount>0)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
				if(Character.isLowerCase(c))
					loCount++;
				if(Character.isUpperCase(c))
					upCount++;
			}
			if(loCount>0 && upCount>0)
			{
				System.out.println("Password have to contain atleast " +min+" characters");
				System.out.println("There should be atleast one Digit");
				System.out.println("There should be atleast one Special chracter");
			}
		}
		
		//TODO.......
	}


}