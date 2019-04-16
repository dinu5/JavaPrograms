public class Average
{
	public static void main(String []args)
	{
	int number[]=new int[]{2,4,6,8,10};
	int sum=0;
	for(int i=0;i<number.length;i++)
		sum=sum+number[i];
	double avg=sum/number.length;
	System.out.println("The average is:"+avg);
	}
}