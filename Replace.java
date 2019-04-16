import java.io.*;
public class Replace
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the word");
		String str=bf.readLine();
		
		char[] c=str.toCharArray();
		
		str=str.replace('a','$');
		str=str.replace('e','$');
		str=str.replace('i','$');
		str=str.replace('o','$');
		str=str.replace('u','$');
		
		System.out.println(str);
		
		
	}
}