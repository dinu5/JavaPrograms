public class Bubble
{
	public static void sort(int arr[])
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				    
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]={8,5,9,1,7};
		System.out.println("Array before sorting");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i] +" ");
		
		sort(arr);
		
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i] +" ");
		
		
		
	}
}