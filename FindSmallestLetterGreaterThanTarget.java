package com.dinu;

public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		char[] letters= {'c','f','j'};
		char target='c';
		int ans=search(letters,target);
		System.out.println(letters[ans]);
		
	}
	static int search(char[] arr,char target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2; //0+2/2=1...0
			if(target>arr[mid])
				start=mid+1;
			else
				end=mid-1;
			
		}
		return start%arr.length;
	}

}
