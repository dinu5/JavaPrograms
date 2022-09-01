package com.dinu;

//Amazon Question

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr= {0,4,1,3};
		System.out.println(find(arr));
		
	}
	static int find(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int element=i;
			int pos=arr[i];
			if((arr[i]!=arr.length) && (arr[pos]!=arr[element])) {
				swap(arr,element, pos);
			}else {
				i++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(j!=arr[j]) {
				return j;
			}
		}
		return arr.length;
	}
	static void swap(int arr[], int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

}
