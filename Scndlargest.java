import java.util.Arrays;
public class Scndlargest
{
	public static void main(String[] args)
	{
	int[] array={5,1,8,9,0,6};
	System.out.println("The original array is:"+Arrays.toString(array));
	Arrays.sort(array);
	int index=array.length-1;
	while(array[index]==array[array.length-1])
	{
	index--;
	}
	System.out.println("The second largest number is:"+array[index]);
	}
}