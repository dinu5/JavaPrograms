package com.dinu;

import java.util.Arrays;

public class BinarySearchOnMatrix {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,22,33,44,555}
		};
		System.out.println(Arrays.toString(findRow(arr,44)));
	//	System.out.println(Arrays.toString(binarySearch(arr,0,4,1)));
	}
	
	static int[] findRow(int arr[][],int target) {
		
		int m=arr[0].length-1;
		int rStart=0;
		int rEnd=arr.length-1;
		while(rStart<=rEnd) {
			int rMid=(rStart+rEnd)/2;
			if(target>=arr[rMid][0] && target<=arr[rMid][m]) {
				return binarySearch(arr, rMid,m,target);
			}
			else if(target<arr[rMid][0]) {
				rEnd=rMid-1;
			}
			else if(target>arr[rMid][m]){
				rStart=rMid+1;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	
	static int[] binarySearch(int arr[][],int row, int end, int target) {
		 int start=row;
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[row][mid]) {
				return new int[] {row,mid};
			}
			else if(target<arr[row][mid]) {
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		
		
		return new int[] {-1,-1};
	}

}
