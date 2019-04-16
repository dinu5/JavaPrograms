import java.io.*;
class Showfile
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream f1=new FileInputStream("./myfile.txt");
		if(args.length!=1){
			System.out.println("Usage: Show File");
		return;
		}
		try{
			f1=new FileInputStream(args[0]);			
		}catch(FileNotFoundException ex){
			System.out.println("File Not Found");
			return;
		}
		try{
			do{
				i=f1.read();
				if(i!=-1)
					System.out.println((char) i);
		    }while (i!=-1);
		} catch(IOException ex){System.out.println("Error Reading file");}
	    try{
			f1.close();
		}catch(IOException ex){System.out.println("Error closing file");}
	}
}