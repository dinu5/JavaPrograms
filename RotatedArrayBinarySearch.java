package com.dinu;

public class RotatedArrayBinarySearch {
	public static void main(String[] args) {
		int[] arr= {7,8,9,2,3,4,5,6};
		int target=4;
		System.out.println(search(arr,target));
		
	}
	static int search(int[] nums, int target) {
		int pivot=findPivot(nums);
		if(pivot==-1) {
			return binarySearch(nums,target,0,nums.length-1);
		}
		if(nums[0]<target) {
			return binarySearch(nums,target,0,pivot);
		}
		else {
			return binarySearch(nums,target,pivot+1,nums.length-1);
		}
			
	}
	
	static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				return mid;
			if(arr[mid]<arr[mid-1])
				return mid-1;
			if(arr[start]>arr[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				} else
					return mid;
	    }
		return -1;
	}

}
