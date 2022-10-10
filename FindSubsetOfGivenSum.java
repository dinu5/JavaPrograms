package com.dinu;

import java.util.ArrayList;
import java.util.HashMap;

//Anuj Bhaiya channel

public class FindSubsetOfGivenSum {

	public static void main(String[] args) {
		int[] arr= {2,5,10,-5,11,20};
		System.out.println(findSub(arr,6));

	}
	
	static ArrayList<Integer> findSub(int[] arr,int sum){
		ArrayList<Integer> ans=new ArrayList<>();
		
		int currSum=0;
		int start=0;
		int end=-1;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(currSum - sum==0) {
				ans.add(start);
				ans.add(i);
				break;
			}
			if(map.containsKey(currSum - sum)) {
				ans.add(map.get(currSum-sum)+1);
				ans.add(i);
			}
			map.put(currSum, i);
		}
		
		
		
		
		return ans;
	}

}
