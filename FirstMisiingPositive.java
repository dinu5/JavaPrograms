package com.dinu;

public class FirstMisiingPositive {
	public static void main(String[] args) {
		int[] arr= {1,2,0};
		System.out.println(sort(arr));
		
	}
	static int sort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int element=i;
			int pos=nums[i]-1;
			if((nums[element]>0) && (nums[element]<nums.length) && (nums[element]!=nums[pos])) {
				swap(nums,element,pos);
			}
			else {
				i++;
			}
		}
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=j+1) {
				return j+1;
			}
		}
		return nums.length+1;
	}
	static void swap(int[] arr,int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}



