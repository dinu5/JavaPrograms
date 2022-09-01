package com.dinu;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {3,1,2,5,4};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxElement=findMax(arr,0,last);
			swap(arr,maxElement,last);
		}
	}
	static int findMax(int[] arr,int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		
	//	System.out.println(max);
		return max;
	}
	static void swap(int[] arr,int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
