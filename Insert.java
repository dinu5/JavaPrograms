import java.util.Arrays;
public class Insert
{
	public static void main(String[] args)
	{
		int array[]={10,20,30,40,50,60,80,90};
		System.out.println("Original array:"+Arrays.toString(array));
		int Index_position=2;
		int newValue=25;
		for(int i=0;i<Index_position+1;i++)
		{
			array[i]=array[i+1];
		}
		Index_position=newValue;
		System.out.println("after inserting:"+Arrays.toString(array));
	}
}