import java.io.*;
public class FileExample1
{
		public static void main(String[] args) throws IOException
		{
		File f1=new File("F:/JavaPrograms/Filefolder.txt");
		
			
			System.out.println("is exist: "+f1.exists());
			f1.createNewFile();
		}
}