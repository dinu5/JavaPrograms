package com.dinu;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {
		int[] arr= {1,2,2,4};
		System.out.println(Arrays.toString(find(arr)));
	}
	static int[] find(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int element=i;
			int pos=nums[i]-1;
			if(nums[element]!=nums[pos]) {
				swap(nums,element,pos);
			}else {
				i++;
			}
		}
		int[] ans=new int[2];
		for(int j=0;j<nums.length;j++) {
			if(j+1!=nums[j]) {
				ans[0]=nums[j];
				ans[1]=j+1;
			}
		}
		return ans;
	}
	static void swap(int arr[], int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}
