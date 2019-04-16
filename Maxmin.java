import java.util.Arrays;
public class Maxmin
{
		static int max;
	    static int min;
		public static void max_min(int array[]){
		int len=array.length;
		max=array[0];
		min=array[0];
		for(int i=1;i<len-1;i++)
		{
			if(i+1>len)
			{
				if(array[i]>max) max=array[i];
				if(array[i]<min) min=array[i];
			}
			if(array[i]>array[i+1])
			{
				if(array[i]>max) max=array[i];
				if(array[i+1]<min) min=array[i+1];
			}
			if(array[i]<array[i+1])
			{
				if(array[i]<min) min=array[i];
				if(array[i+1]>max) max=array[i+1];
			}
		}
		}
	    public static void main(String []args)
		{
			int[] array={8,0,4,6,2,1,7,9,3};
			max_min(array);
			System.out.println("Original array is:"+Arrays.toString(array));
			System.out.println("Maximum value of the array:"+max);
			System.out.println("Minimum value of the array:"+min);
		}
}