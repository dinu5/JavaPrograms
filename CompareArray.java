import java.util.Scanner;
public class CompareArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " +i+ " element ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Content of arr: ");
		for(int m: arr)
			System.out.print(m +" ");
		
		int arr2[]=new int[arr.length];
		
		arr2=arr;
		
		
		System.out.println();
		System.out.print("Content of arr2: ");
		for(int k: arr2)
			System.out.print(k +" ");
		
		System.out.println();
		if(arr==arr2)
			System.out.println("Yes! these arrays are equal");
		else
			System.out.println("Nopes! these arrays are not equal");
	}
}