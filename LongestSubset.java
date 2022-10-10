package com.dinu;

import java.util.ArrayList;
import java.util.HashMap;

// find the longest subset of given sum

public class LongestSubset {

	public static void main(String[] args) {
		int[] arr= {2,5,10,-5,11,20};
		System.out.println(findSub(arr,16));

	}
	
	static ArrayList<Integer> findSub(int[] arr,int sum){
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap();
		int diff=0;
		int start=0;
		int end=0;
		int currSum=0;
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(currSum - sum==0) {
				if(diff<i - start) {
					ans.add(start);
					ans.add(i);
					
				}
			}
			
			if(map.containsKey(currSum - sum)) {
				if(diff < i - map.get(currSum-sum)+1) {
					ans.add(map.get(currSum-sum)+1);
					ans.add(i);
				}
				
			}
			map.put(currSum , i);
			
		}
		
		
		
		return ans;
	}

}
