import java.util.Arrays;
public class Reverse
{
		public static void main(String []args)
		{
		int[] array={1,2,3,4,5,6,7,8,9};
		System.out.println("The original array is:"+Arrays.toString(array));
		for(int i=0;i<array.length/2;i++)
			{
				int temp=array[i];
				array[i]=array[array.length-i-1];
				array[array.length-i-1]=temp;
			}
		System.out.println("The reverse array is:"+Arrays.toString(array));
		}
}