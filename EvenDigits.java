package com.dinu;

public class EvenDigits {
	public static void main(String[] args) {
		int[] arr= {23,1,432,32,54,75,532,213,3};
		int evenCount=0;
		for(int i=0;i<arr.length;i++)
		{
			int ans=count(arr[i]);
			if(ans%2==0)
				evenCount++;
		}
		System.out.println(evenCount);
		
	}
	
	static int count(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		
		
		return count;
	}

}
