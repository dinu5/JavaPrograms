package com.dinu;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 7, 10, 30, 56, 102 };
		int[] arr2 = { 333, 23, 21, 12, 10, 1, -1, -45 };
		int target = -1;
		int ans = search(arr2, target);
		System.out.println(ans);
	}

	static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				} else
					return mid;
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else if (target < arr[mid]) {
					start = mid + 1;
				} else
					return mid;
			}
		}

		return -1;
	}

}
