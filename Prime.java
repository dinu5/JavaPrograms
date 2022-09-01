package com.dinu;

public class Prime {
	public static void main(String[] args) {
		int n=100;
		boolean[] arr=new boolean[n+1];
		isPrime(arr,n);
		
	}
	
	static void isPrime(boolean[] primes,int n) {
		for(int i=2;i*i<=n;i++) {
			if(!primes[i]) {
				for(int j=i+i;j<=n;j+=i) {
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				System.out.print(i+ " ");
			}
		}
	}

}
