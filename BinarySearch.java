public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[]={2,3,5,9,10,12};
		int search=10;
		int l=0;
		int r=arr.length-1;
		int mid=(l+r)/2;
		
		while(l<=r)
		{
			if(search==arr[mid]){
				System.out.println("The element is in "+mid+" index");
				break;
			}
			
			else if(search>mid)
			{
				l=mid+1;
				
			}
			
			else{
				r=mid-1;
				
			}
			mid=(l+r)/2;
				
		}
		if(l>r)
			System.out.println("Element not found");
	}
}