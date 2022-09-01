package com.dinu;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}
	
    static int[] searchRange(int[] nums, int target) {
		 int[] arr= {-1,-1};
		 arr[0]=search(nums,target,true);
		 arr[1]=search(nums,target,false);
		 return arr;
	        
	    }
	 static int search(int[] nums,int target,boolean findFirstPosition) {
		 int ans=-1;
		 int start=0;
		 int end=nums.length-1;
		 while (start<=end) {
			 int mid=start+(end-start)/2;
			 if(target<nums[mid])
				 end=mid-1;
			 else if(target>nums[mid])
				 start=mid+1;
			 else 
			 {
				 ans=mid;
				 if(findFirstPosition) {
					 end=mid-1;
				 }
				 else
					 start=mid+1;
			 }
		 }
		 
		 return ans;
	 }

}