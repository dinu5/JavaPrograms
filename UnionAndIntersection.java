import java.util.Arrays;
public class UnionAndIntersection
{
	
	public static void printUnion(int arr1[],int arr2[],int m,int n)
	{
		if(m<n)
		{
			int t=m;
			m=n;
			n=t;
			
			int temp[]=arr1;
			arr1=arr2;
			arr2=temp;
		}
		Arrays.sort(arr1);
		for(int i=0;i<m;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		for(int i=0;i<n;i++)
		{
			if(binarySearch(arr1,0,n-1,arr2[i])==-1)
				System.out.print(arr2[i]+" ");
		}
		
	}
	
	public static void printIntersection(int arr1[],int arr2[],int m,int n)
	{
		if(m<n)
		{
			int temp=m;
			m=n;
			n=temp;
			
			int t[]=arr1;
			arr1=arr2;
			arr2=t;
		}
		
		Arrays.sort(arr1);

		for(int i=0;i<n;i++)
		{
			if(binarySearch(arr1,0,m-1,arr2[i])!=-1)
				System.out.print(arr2[i]+" ");
		}
	}
	
	public static int binarySearch(int arr1[],int l,int r,int x)
	{
		int mid=(l+r)/2;
		while(l<=r)
		{
		if(arr1[mid]==x){
			return mid;
			//break;
		}
		
		else if(x>mid)
		{
			l=mid+1;
		}
		else
			r=mid-1;
		mid=(l+r)/2;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int arr1[]={5,2,4,9,3};
		int arr2[]={7,1,3,5};
		int m=arr1.length;
		int n=arr2.length;
		
		System.out.println("The union is ");
		printUnion(arr1,arr2,m,n);
		System.out.print("The intersection is ");
		printIntersection(arr1,arr2,m,n);
	}
}