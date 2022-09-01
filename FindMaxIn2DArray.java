package com.dinu;

import java.util.Arrays;

public class FindMaxIn2DArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{4,12,98,54},
				{42,-1,4,33},
				{1,95,-4},
				{32,43,57}
				
		};
		int ans=max(arr);
		System.out.println(ans);

	}
	static int max(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>max) {
					max=arr[row][col];
				}
				
			}
		}
		return max;
	}

}
