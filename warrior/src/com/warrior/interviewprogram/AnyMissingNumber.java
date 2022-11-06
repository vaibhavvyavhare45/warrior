package com.warrior.interviewprogram;

public class AnyMissingNumber {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6};
		int n,tot_sum,sum=0;
		n=a.length+1;
		tot_sum=n*(n+1)/2;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		int miss=tot_sum-sum;
		System.out.println("missing number is: "+miss);
		
	}

}
