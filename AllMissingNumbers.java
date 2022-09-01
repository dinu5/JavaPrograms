package com.dinu;

import java.util.ArrayList;
import java.util.List;

class AllMissingNumbers {
	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	
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
    	List<Integer> ans=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++) {
    	    if(nums[j]!=j+1) {
    		   ans.add(j+1);
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