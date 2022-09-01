package com.dinu;

public class CeilingOfANumber {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 30, 56, 102};
		int target = 102;
		int ans = search(arr, target);
		System.out.println(ans);
	}
	static int search(int[] arr,int target)
	{
		int start=0;
		int end=arr.length;
		
		//what if the target number is greater than the greatest number
		if(target>arr[end-1])
			return -1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else if(target==arr[mid])
				return mid;
		}
		return start;
	}

}
