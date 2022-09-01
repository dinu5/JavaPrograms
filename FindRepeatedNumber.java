package com.dinu;

public class FindRepeatedNumber {
	public static void main(String[] args) {
		int[] arr= {3,1,3,4,2};
		System.out.println(sort(arr));
		
	}
	
	static int sort(int[] nums) {
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
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=j+1) {
				return nums[j];
			}
		}
		return -1;
	}
	static void swap(int arr[], int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}
