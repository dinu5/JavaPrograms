import java.util.Arrays;
public class RemoveArrayElement
{
		public static void main(String []args)
		{
		int[] array={1,2,3,4,5,6,7};
		System.out.println("Original array:"+Arrays.toString(array));
		int removeIndex=1;
		for(int i=removeIndex;i<array.length-1;i++)
			{
			array[i]=array[i+1];
			}
			System.out.println("after removing"+Arrays.toString(array));
		}
}