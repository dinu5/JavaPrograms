import java.io.*;
public class FileExample2
{
		public static void main(String[] args) throws IOException
		{
			int i;
			FileOutputStream f1=new FileOutputStream("./myfile.txt", true);
			String s="I Love You Indrani";
			char ch[]=s.toCharArray();
			for(i=0;i<s.length();i++)
				f1.write(ch[i]);
			f1.close();
		}
} 