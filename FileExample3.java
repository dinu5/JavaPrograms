import java.io.*;
public class FileExample3
{
	public static void main(String[] args) throws IOException
	{
	int i;
	FileInputStream f1=new FileInputStream("./myfile.txt");
	do{ 
	  i=f1.read();
	  if(i!=-1)
	   System.out.print((char)i);
	  }while(i!=-1);
	}
}