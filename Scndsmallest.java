import java.util.Arrays;
public class Scndsmallest
{
	public static void main(String[] args)
	{
	int[] array={5,1,8,9,0,6};
	System.out.println("The original array is:"+Arrays.toString(array));
	Arrays.sort(array);
	System.out.println("The sorted array:"+Arrays.toString(array));
	for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]!=array[j]){
				System.out.println("The second largest number is:"+array[j]);
				break;
				}
			
			}
			break;
		}
	}
}