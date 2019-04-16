public class Common
{
	public static void main(String[] args)
	{
	String[] array1={"Riju","Arijit","Atanu","Abhi","Rijum"};
	String[] array2={"Riju","Som","Debraj","Dinu","Rijum"};
	for(int i=0;i<array1.length;i++)
		{
		for(int j=0;j<array2.length;j++)
			{
			if((array1[i]).equals(array2[j]))
				{System.out.println("The common element is:"+array2[j]);}
			}
		}
	}
}