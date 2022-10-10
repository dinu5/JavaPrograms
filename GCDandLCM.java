package com.dinu;

public class GCDandLCM {

	public static void main(String[] args) {
		System.out.println("GCD is "+findGCD(3,16));
		System.out.println("LCM is "+findLCM(3,6));

	}
	
	static int findGCD(int n1,int n2) {
		if(n1==0)
			return n2;
		return findGCD(n2%n1,n1);
	}
	
	static int findLCM(int n1,int n2) {
		int lcm=(n1*n2)/findGCD(n1,n2);
		return lcm;
	}

}
