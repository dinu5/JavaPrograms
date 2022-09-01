package com.dinu;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr= {3,1,2,5,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int element=i;
			int pos=arr[i]-1;
			if(arr[element]!=arr[pos]) {
				swap(arr,i,pos);
			}
			else {
				i++;
			}
		}
	}
	
	static void swap(int arr[], int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}
