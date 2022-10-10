package com.dinu;

public class ReplaceSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Never Give up dude";
		System.out.println(replace(s));

	}
	static String replace(String s) {
		String[] arr=s.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				ans=ans+arr[i];
			else
			ans=ans+arr[i]+"%20";
		}
		return ans;
	}

}
