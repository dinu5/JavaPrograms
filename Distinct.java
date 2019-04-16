public class Distinct
{
	public static void main(String[] args)
	{
		String arr1="abcd";
		String arr2="xyab";
		String final1="";
		String final2="";
		
		for(int i=0;i<arr1.length();i++)
		{
			for(int j=0;j<arr2.length();j++)
			{
				if(arr1.charAt(i)!=arr2.charAt(j)){
					if(!final1.contains(String.valueOf(arr1.charAt(i))))
						final1=final1 + arr1.charAt(i);
					if(!final2.contains(String.valueOf(arr2.charAt(j))) || !final1.contains(String.valueOf(arr1.charAt(i))))
						final2=final2 + arr2.charAt(j);
				}
			}
		}
		System.out.println(final1+final2);
	}
}