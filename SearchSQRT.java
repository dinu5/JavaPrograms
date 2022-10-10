//find square root of a number by using BS

package com.dinu;

public class SearchSQRT {
	public static void main(String[] args) {
		int n=300;
		int p=3;
		System.out.printf("%.3f",search(n,p));
	}
	
	static double search(int n, int p) {
		double root=0;
		int s=0;
		int e=n;
		while (s<=e) {
			int m=s+(e-s)/2;
			if(m*m==n) return m;
			else if(m*m>n) e=m-1;
			else s=m+1;
		}
		root=e;
		double inc=0.1;
		for(int i=0;i<p;i++) {
			root+=inc;
			while (root*root<=n) {
				root+=inc;
			}
			root-=inc;
			inc=inc/10;
		}
		
		return root;
	}

}
