package com.dinu;

import java.util.Arrays;

public class RowColMatrix {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,22,33,44,555}
		};
		System.out.println(Arrays.toString(search(arr,1)));
	}
	static int[] search(int[][] arr, int target) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(target==arr[row][col]) {
				return new int[] {row,col};
			}
			else if(target<arr[row][col]) {
				col--;
			}
			else {
				row++;
			}
		}
		
		
		return new int[] {-1,-1};
	}

}
