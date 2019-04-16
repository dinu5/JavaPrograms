import java.util.Arrays;
public class Sorting
{
		public static void main(String []args)
		{
		int array1[]={5,8,4,3,7,1};
		String array2[]={"t","S","A","Q","E","D"};
		System.out.println("The original numaric array is:"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("The sorted numeric array is:"+Arrays.toString(array1));
		System.out.println("The original string array is:"+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("The sorted string array is:"+Arrays.toString(array2));
		}
}