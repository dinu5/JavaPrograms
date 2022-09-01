package com.dinu;

public class CountRotation {
	public static void main(String[] args) {
		int[] arr= {7,8,2,3,4,5,6};
		System.out.println(findCount(arr)+1);
	}
	static int findCount(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid]<arr[mid-1])
				return mid-1;
			else if(arr[start]<arr[mid])
				start=mid+1;
			else 
				end=mid-1;
		}
		return -1;
	}

}
