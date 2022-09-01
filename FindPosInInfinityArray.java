package com.dinu;

public class FindPosInInfinityArray {
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,8,11,14,23,34,56,77,100,111};
		int target=1;
		System.out.println(doubleRange(arr,target));
	}
	static int doubleRange(int[] arr,int target)
	{
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
			
		}
		return binarySearch(arr,target,start,end);
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else 
				return mid;
		}
		return -1;
	}

}
