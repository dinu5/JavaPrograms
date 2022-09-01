package com.dinu;

import java.util.Arrays;

public class SuffleArray {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(shuffle(nums)));
	}
	static int[] shuffle(int[] nums) {
        if(nums==null){
            return null;
        }
        
        int len=nums.length;
        int[] arr=new int[len];    
        for(int i=0;i<len;i++){
            if(i%2!=0){
                arr[i]=nums[i];
                i--;
            }
            else{
                arr[i]=nums[i+len/2];
            }
        }
        return arr;
    }

}
