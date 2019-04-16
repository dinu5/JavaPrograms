import java.util.*;
import java.io.*;
public class MissingElement
{
	//Scanner sc;
	static int sumOfNumbers(int n)
	{
		int sum=(n*(n+1))/2;
		return sum;
	}
	
	static int sumOfElements(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum=sum+array[i];
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements number");
		int n=sc.nextInt();
		//int n=5;
		int[] array={1,2,3,5};
		int sumOfNumbers=sumOfNumbers(n);
		int sumOfElements=sumOfElements(array);
		int missing=sumOfNumbers-sumOfElements;
		System.out.println("Missing element is : "+missing);
	}
}