import java.util.*;
public class SecondSmallest
{
	public static int smallestNo(Integer ar[],int k)
	{
		Arrays.sort(ar);
		return ar[k-1];
	}
	public static void main(String[] args)
	{
		Integer ar[]=new Integer[]{55,9,2,46,0,4};
		int k=2;
		System.out.println("Second smallest number is : "+smallestNo(ar,k));
	}
}