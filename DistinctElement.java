public class DistinctElement
{
	static void m1(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
				if(arr[i]==arr[j])
					break;
				
			if(i==j)
				System.out.println(arr[i] +" ");
		}	
	}
	
	public static void main(String[] args)
	{
		int arr[]={1,1,1,1,1,1};
		System.out.println("Input is");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
		
		System.out.println("\n");
		System.out.println("Output is");
	
		m1(arr);
	}
}