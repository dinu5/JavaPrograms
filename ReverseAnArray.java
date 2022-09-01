package com.dinu;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr= {2,4,1,34,21,87};
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			reverse(arr,start,end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	static void reverse(int arr[],int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}

}
