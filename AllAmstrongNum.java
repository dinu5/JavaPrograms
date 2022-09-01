package com.dinu;

import java.util.Scanner;

public class AllAmstrongNum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=1000;i++) {
		if(fun(i))
			System.out.println(i);
		
		}
	}
	
	static boolean fun(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
		int rem=n%10;
		
		sum=sum+rem*rem*rem;
		n=n/10;
		}
		return temp==sum;
		
	}
}
