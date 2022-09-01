package com.dinu;

public class FindTargetInMountainArray {
	public static void main(String[] args) {
		int[] arr= {2,5,7,8,9,11,33,55,66,45,23,22,19,12,3,0};
		int target=12;
		int peak=findPeak(arr);
		/*
		 * System.out.println("peak : "+peak);
		 * System.out.println(binarySearch(arr,target,0,8));
		 */
		int index=binarySearch(arr,target,0,peak);
		if(index==-1) {
			index=binarySearch(arr,target,peak+1,arr.length-1);
		}
			
		System.out.println(index);
	}
	
	static int findPeak(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		return start;
	}
	
	static int binarySearch(int arr[],int target,int start,int end) {
		boolean isAsc=arr[end]>arr[start];
		while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		else {
			if(target<arr[mid]) {
				if(isAsc) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
				
			}
			else {
				if(isAsc) {
					start=mid+1;
					
				}
				else {
					end=mid-1;
				}
			}
		}
		}
		return -1;
	}

}
